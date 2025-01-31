package com.mc.adventure.domain.item;

import com.mc.adventure.domain.item.armor.Armor;
import com.mc.adventure.domain.item.armor.ChestArmor;
import com.mc.adventure.domain.item.armor.code.ArmorGroup;
import com.mc.adventure.domain.item.weapon.Axe;
import com.mc.adventure.domain.item.weapon.Sword;
import com.mc.adventure.domain.item.weapon.Weapon;
import com.mc.adventure.domain.item.weapon.code.AxeGroup;
import com.mc.adventure.domain.item.weapon.code.SwordGroup;

import java.util.Random;

public class EquipmentFactory {

    private static final Random random = new Random();

    public static Equipment createRandomItem() {
        int type = random.nextInt(2);

        if (type == 0) {
            return createRandomWeapon();
        }

        return createRandomArmor();
    }

    public static Weapon createRandomWeapon() {
        int type = random.nextInt(2);

        if (type == 0) {
            int idx = random.nextInt(SwordGroup.values().length);
            return new Sword(SwordGroup.values()[idx]);
        }

        int idx = random.nextInt(AxeGroup.values().length);
        return new Axe(AxeGroup.values()[idx]);
    }

    public static Armor createRandomArmor() {
        int idx = random.nextInt(ArmorGroup.values().length);
        return new ChestArmor(ArmorGroup.values()[idx]);
    }
}
