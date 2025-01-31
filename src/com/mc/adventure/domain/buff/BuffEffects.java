package com.mc.adventure.domain.buff;

import java.util.LinkedList;
import java.util.List;

public class BuffEffects {

    private List<BuffEffect> effects = new LinkedList<>();

    public void add(BuffEffect effect) {
        effects.add(effect);
    }


    public int calBuffDefWeight(int damage) {
        damage -= effects.stream()
                .map(BuffEffect::defWeight)
                .mapToInt(e->e)
                .sum();

        return damage;
    }

    public int calBuffAtkWeight(int damage) {
        damage += effects.stream()
                .map(BuffEffect::atkWeight)
                .mapToInt(e->e)
                .sum();

        return damage;
    }

    public void deductDuration() {
        effects.forEach(e -> {
            int d = e.deductDuration();
            if(d <= 0){
                effects.remove(e);
            }
        });
    }

    @Override
    public String toString() {
        return effects.toString();
    }

    public boolean isEmpty() {
        return effects.isEmpty();
    }
}
