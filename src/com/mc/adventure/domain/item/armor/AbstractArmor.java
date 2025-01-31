package com.mc.adventure.domain.item.armor;

import com.mc.adventure.domain.buff.BuffEffect;
import com.mc.adventure.domain.skill.Skill;
import com.mc.adventure.domain.skill.SkillGroup;

public abstract class AbstractArmor implements Armor{

    protected final String name;
    protected final int defWeight;
    protected Skill skill = SkillGroup.NONE.skill();

    public AbstractArmor(String name, int defWeight, Skill skill) {
        this.name = name;
        this.defWeight = defWeight;
        this.skill = skill;
    }

    @Override
    public int calDefWeight(int damage) {
        return damage - defWeight;
    }

    @Override
    public BuffEffect activateSkill() {
        if(skill == SkillGroup.NONE.skill()) {
            System.out.println("등록된 장비마법이 없습니다.");
            return skill.activate();
        }

        System.out.println(name + "의 장비마법이 발동됩니다.");
        return skill.activate();
    }

    @Override
    public int getCoolTime() {
        return skill.getCoolTime();
    }
}
