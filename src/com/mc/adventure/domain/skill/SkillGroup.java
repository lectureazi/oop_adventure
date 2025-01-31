package com.mc.adventure.domain.skill;

import com.mc.adventure.domain.buff.Buff;

public enum SkillGroup {
    NONE(new Skill("없음", 0, 0, Buff.NONE)),
    ANGER(new Skill("분노", 5, 2, Buff.ANGER)),
    ANGER_LV2(new Skill("큰 분노", 5, 3, Buff.ANGER)),
    PATIENT(new Skill("인내", 3, 2, Buff.PATIENT)),
    PATIENT_LV2(new Skill("큰 인내", 3, 3, Buff.PATIENT)),
    IMMORTAL(new Skill("불사", 5, 3, Buff.IMMORTAL));

    private final Skill skill;

    SkillGroup(Skill skill) {
        this.skill = skill;
    }

    public Skill skill(){
        return skill;
    }
}
