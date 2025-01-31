package com.mc.adventure.domain.event;

import com.mc.adventure.domain.character.player.Player;
import com.mc.adventure.domain.item.Equipment;
import com.mc.adventure.domain.item.EquipmentFactory;

import java.util.Scanner;

public class ItemEvent implements Event {

    private Scanner sc = new Scanner(System.in);

    @Override
    public boolean occur(Player player) {
        System.out.println("* 보물상자를 발견했습니다. 멋진 아이템이 등장합니다.");
        Equipment equipment = EquipmentFactory.createRandomItem();

        System.out.println("============================");
        System.out.println(equipment);
        System.out.println("============================");

        System.out.print("\n* 장착하시겠습니까?(y/n): ");
        String input = sc.nextLine().toLowerCase();
        if(input.equals("n")) return true;

        player.equip(equipment);
        return true;
    }
}
