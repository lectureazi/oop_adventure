package com.mc.adventure.domain.character.monster;

import java.util.Random;

public class MonsterFactory {

    private static final Random random = new Random();

    public static Monster createMonster() {
        int index = random.nextInt(MonsterGroup.values().length);
        return new Monster(MonsterGroup.values()[index]);
    }
}
