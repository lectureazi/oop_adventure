package com.mc.adventure.domain.adventure;

import com.mc.adventure.domain.character.player.Player;
import com.mc.adventure.domain.event.BattleEvent;
import com.mc.adventure.domain.event.Event;
import com.mc.adventure.domain.event.EventEnum;

import java.util.Random;
import java.util.Scanner;

public class Adventure {

    private final Event[] events = new Event[8];

    public Adventure() {
        for (int i = 0; i < events.length-1; i++) {
            Random random = new Random();
            int idx = random.nextInt(4);
            events[i] = EventEnum.values()[idx].getEvent();
        }
        events[events.length-1] = new BattleEvent();
    }

    public boolean go(Player player) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < events.length; i++) {
            scanner.nextLine();
            Event event = events[i];
            System.out.println(i + 1 + "번째 이벤트 발생!");

            boolean isClear = event.occur(player);

            if(!isClear){
                return false;
            }

            System.out.println("\n================================");
        }

        return true;
    }
}
