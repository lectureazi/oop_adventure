package com.mc.adventure.domain.item.armor;

import com.mc.adventure.domain.item.Equipment;

public interface Armor extends Equipment {
    int calDefWeight(int damage);
    int getCoolTime();
}
