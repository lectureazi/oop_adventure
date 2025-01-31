package com.mc.adventure.domain.character.monster;

import com.mc.adventure.domain.character.Character;

import java.util.Random;

public class Monster extends Character {

    Monster(MonsterGroup monster) {
        super(monster.getName(), monster.getHp(), monster.getAtk(), monster.getDef());
    }

    Monster(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
    }

    @Override
    public void attack(Character target) {
        Random random = new Random();
        int damage = random.nextInt((int) (atk*0.5), (int) (atk*1.5));
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        damage -= def;
        if (damage <= 0) damage = 0;

        System.out.println(name + " " + damage + " 데미지를 받았습니다.");
        currentHp -= damage;
        this.currentHp = Math.max(this.currentHp, 0);
    }
}
