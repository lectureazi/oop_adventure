package com.mc.adventure.domain.item.armor.code;

import com.mc.adventure.domain.skill.Skill;
import com.mc.adventure.domain.skill.SkillGroup;

public enum ArmorGroup {
    WOOD_ARMOR("나무갑옷", 4, SkillGroup.PATIENT.skill()),
    RATHER_ARMOR("가죽갑옷", 7, SkillGroup.PATIENT.skill()),
    CHAIN_ARMOR("체인메일", 9, SkillGroup.PATIENT.skill()),
    PLATE_ARMOR("중갑옷", 12, SkillGroup.PATIENT.skill()),
    DIAMOND_ARMOR("다이아몬드갑옷", 15, SkillGroup.PATIENT_LV2.skill());

    private final String name;
    private final int def;
    private final Skill skill;

    ArmorGroup(String name, int def, Skill skill) {
        this.name = name;
        this.def = def;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getDef() {
        return def;
    }

    public Skill getSkill() {
        return skill;
    }
}
