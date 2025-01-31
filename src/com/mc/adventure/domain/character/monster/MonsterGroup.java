package com.mc.adventure.domain.character.monster;

public enum MonsterGroup {

    SLIME("슬라임", 100, 5, 3),
    GOBLIN("고블린", 150, 9, 5),
    DRAKE("드레이크", 200, 20, 10),
    DRAGON("드레곤", 400, 30, 20),
    DIABLO("디아블로", 700, 60, 35);

    private String name;
    private int hp;
    private int atk;
    private int def;

    MonsterGroup(String name, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}
