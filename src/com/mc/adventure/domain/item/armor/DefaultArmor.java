package com.mc.adventure.domain.item.armor;

import com.mc.adventure.domain.skill.SkillGroup;

public class DefaultArmor extends AbstractArmor {
    public DefaultArmor() {
        super("", 1, SkillGroup.NONE.skill());
    }
}
