package com.mc.adventure.domain.item.weapon;

import com.mc.adventure.domain.item.Equipment;

public interface Weapon extends Equipment {
    int calAtkWeight(int damage);
    void attack();
    int getCoolTime();
}
