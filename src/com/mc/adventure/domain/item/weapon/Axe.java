package com.mc.adventure.domain.item.weapon;


import com.mc.adventure.domain.buff.BuffEffect;
import com.mc.adventure.domain.item.weapon.code.AxeGroup;
import com.mc.adventure.domain.skill.Skill;

public class Axe extends AbstractWeapon {

    public Axe(AxeGroup e) {
        super(e.getName(), e.getAtk(), e.getSkill());
    }

    public Axe(String name, int atkWeight, Skill skill) {
        super(name, atkWeight, skill);
    }

    @Override
    public void attack() {
        System.out.println(name+ "을 묵직하게 내려찍습니다.");
    }

    @Override
    public BuffEffect activateSkill() {
        return skill.activate();
    }

    @Override
    public String toString() {
        return "Axe{" +
                "name='" + name + '\'' +
                ", atkWeight=" + atkWeight +
                ", skill=" + skill +
                '}';
    }
}
