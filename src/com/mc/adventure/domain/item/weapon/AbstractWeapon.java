package com.mc.adventure.domain.item.weapon;

import com.mc.adventure.domain.buff.BuffEffect;
import com.mc.adventure.domain.skill.Skill;
import com.mc.adventure.domain.skill.SkillGroup;

public abstract class AbstractWeapon implements Weapon{
    protected final String name;
    protected final int atkWeight;
    protected Skill skill = SkillGroup.NONE.skill();

    public AbstractWeapon(String name, int atkWeight, Skill skill) {
        this.name = name;
        this.atkWeight = atkWeight;
        this.skill = skill;
    }

    @Override
    public int getCoolTime() {
        return skill.getCoolTime();
    }

    @Override
    public int calAtkWeight(int damage) {
        return damage + atkWeight;
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
}
