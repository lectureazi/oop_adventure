package com.mc.adventure.domain.event;

import com.mc.adventure.domain.character.player.Player;

import java.util.Random;

public class FoodEvent implements Event {

    @Override
    public boolean occur(Player player) {
        Random random = new Random();
        int restore = random.nextInt(10, 30);
        System.out.println("맛있는 음식을 발견합니다.");
        player.chargeHP(restore);
        return true;
    }
}
