package com.mc.adventure.domain.skill;

import com.mc.adventure.domain.buff.Buff;
import com.mc.adventure.domain.buff.BuffEffect;

public class Skill {
    private final String name;
    private final int coolTime;
    private final int duration;
    private final Buff buff;

    Skill(String name, int coolTime, int duration, Buff buff) {
        this.name = name;
        this.coolTime = coolTime;
        this.duration = duration;
        this.buff = buff;
    }

    public String getName() {
        return name;
    }

    public int getCoolTime() {
        return coolTime;
    }

    public BuffEffect activate() {
        if(this.equals(SkillGroup.NONE.skill())) return new BuffEffect(buff, duration);
        System.out.println(name + " 버프 발동!");
        return new BuffEffect(buff, duration);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", coolTime=" + coolTime +
                ", duration=" + duration +
                ", buff=" + buff +
                '}';
    }
}
