package com.mc.adventure.domain.buff;

public enum Buff {

    NONE(0, 0),
    ANGER(5, 1),
    PATIENT(1, 5),
    IMMORTAL(1, 10000);

    private final int atkWeight;
    private final int defWeight;

    Buff(int atkWeight, int defWeight) {
        this.atkWeight = atkWeight;
        this.defWeight = defWeight;
    }

    public int getAtkWeight() {
        return atkWeight;
    }

    public int getDefWeight() {
        return defWeight;
    }
}
