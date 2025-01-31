package com.mc.adventure.domain.item.weapon;

import com.mc.adventure.domain.item.weapon.code.SwordGroup;
import com.mc.adventure.domain.skill.Skill;

public class Sword extends AbstractWeapon{

    public Sword(SwordGroup e) {
        super(e.getName(), e.getAtk(), e.getSkill());
    }

    public Sword(String name, int atkWeight, Skill skill) {
        super(name, atkWeight, skill);
    }

    @Override
    public void attack() {
        System.out.println(name + "을 날카롭게 휘두릅니다.");
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                ", atkWeight=" + atkWeight +
                ", skill=" + skill +
                '}';
    }
}
