package com.mc.adventure.domain.character;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int currentHp;
    protected int atk;
    protected int def;

    public Character(String name, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.currentHp = hp;
        this.atk = atk;
        this.def = def;
    }

    public abstract void attack(Character target);
    public abstract void takeDamage(int damage);

    public String getName() {
        return name;
    }

    public boolean isDead() {
        return currentHp <= 0;
    }

    public int getCurrentHp() {
        return currentHp;
    }
}
