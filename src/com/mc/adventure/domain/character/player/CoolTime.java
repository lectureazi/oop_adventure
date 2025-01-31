package com.mc.adventure.domain.character.player;

public class CoolTime {
    private boolean usedPlayerSkill;
    private int armorTime;
    private int weaponTime;

    public boolean isArmorReady(){
        return armorTime == 0;
    }

    public boolean isWeaponReady(){
        return weaponTime == 0;
    }

    public boolean usedPlayerSkill(){
        return usedPlayerSkill;
    }

    public void applyPlayer(boolean usePlayerSkill) {
        this.usedPlayerSkill = usePlayerSkill;
    }

    public void applyArmor(int armorTime) {
        this.armorTime = armorTime;
    }

    public void applyWeapon(int weaponTime) {
        this.weaponTime = weaponTime;
    }

    public void deduct(){
        armorTime = armorTime > 0 ? --armorTime : 0;
        weaponTime = weaponTime > 0 ? --weaponTime : 0;
    }
}
