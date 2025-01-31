package com.mc.adventure.domain.item.weapon.code;

import com.mc.adventure.domain.skill.Skill;
import com.mc.adventure.domain.skill.SkillGroup;

public enum AxeGroup {
    AXE("도끼", 5, SkillGroup.ANGER.skill()),
    BRONZE_AXE("청동도끼", 10, SkillGroup.ANGER.skill()),
    IRON_AXE("철도끼", 15, SkillGroup.ANGER.skill()),
    STEEL_AXE("강철도끼", 25, SkillGroup.ANGER.skill()),
    NAMED_AXE("명도끼", 30, SkillGroup.ANGER_LV2.skill());

    private final String name;
    private final int atk;
    private final Skill skill;

    AxeGroup(String name, int atk, Skill skill) {
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
