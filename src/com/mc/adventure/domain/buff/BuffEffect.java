package com.mc.adventure.domain.buff;

public class BuffEffect {
    private final Buff buff;
    private int duration;

    public BuffEffect(Buff buff, int duration) {
        this.buff = buff;
        this.duration = duration;
    }

    public int atkWeight() {
        return buff.getAtkWeight();
    }

    public int defWeight() {
        return buff.getDefWeight();
    }

    public String name(){
        return buff.name();
    }

    public int deductDuration() {
        this.duration--;
        return this.duration;
    }

    @Override
    public String toString() {
        return "{buff=" + buff +
                ", duration=" + duration + "}";
    }
}
