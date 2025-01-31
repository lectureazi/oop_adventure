package com.mc.adventure.domain.item.weapon.code;

import com.mc.adventure.domain.skill.Skill;
import com.mc.adventure.domain.skill.SkillGroup;

public enum SwordGroup {

    SWORD("검", 5, SkillGroup.ANGER.skill()),
    BRONZE_SWORD("청동검", 9, SkillGroup.ANGER.skill()),
    IRON_SWORD("철검", 13, SkillGroup.ANGER.skill()),
    STEEL_SWORD("강철검", 22, SkillGroup.ANGER.skill()),
    NAMED_SWORD("명검", 28, SkillGroup.ANGER_LV2.skill());

    private final String name;
    private final int atk;
    private final Skill skill;

    SwordGroup(String name, int atk, Skill skill) {
        this.name = name;
        this.atk = atk;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getAtk() {
        return atk;
    }

    public Skill getSkill() {
        return skill;
    }
}
