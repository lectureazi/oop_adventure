package com.mc.adventure.domain.item.weapon;

import com.mc.adventure.domain.skill.SkillGroup;

public class DefaultWeapon extends AbstractWeapon{

    public DefaultWeapon() {
        super("", 1, SkillGroup.NONE.skill());
    }

    @Override
    public void attack() {
        System.out.println("주먹을 힘차게 내지릅니다.");
    }

}
