package com.mc.adventure.domain.event;

import com.mc.adventure.domain.character.player.Player;

import java.util.Random;

public class ExpEvent implements Event {

    @Override
    public boolean occur(Player player) {
        Random random = new Random();
        int exp = random.nextInt(20, 50);
        System.out.println("좋은 사람을 만나 즐거운 시간을 보냈습니다! exp " + exp + " 획득!");
        player.addExperience(exp);
        return true;
    }
}
