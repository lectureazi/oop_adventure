package com.mc.adventure.domain.item.armor;

import com.mc.adventure.domain.item.armor.code.ArmorGroup;
import com.mc.adventure.domain.skill.Skill;

public class ChestArmor extends AbstractArmor {

    public ChestArmor(ArmorGroup e) {
        super(e.getName(), e.getDef(), e.getSkill());
    }

    public ChestArmor(String name, int defWeight, Skill skill) {
        super(name, defWeight, skill);
    }

    @Override
    public String toString() {
        return "ChestArmor{" +
                "name='" + name + '\'' +
                ", defWeight=" + defWeight +
                ", skill=" + skill +
                '}';
    }
}
