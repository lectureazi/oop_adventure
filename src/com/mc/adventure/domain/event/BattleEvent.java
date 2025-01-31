package com.mc.adventure.domain.event;

import com.mc.adventure.domain.character.monster.Monster;
import com.mc.adventure.domain.character.monster.MonsterFactory;
import com.mc.adventure.domain.character.player.Player;

import java.util.Scanner;

public class BattleEvent implements Event {

    private Scanner sc = new Scanner(System.in);

    @Override
    public boolean occur(Player player) {
        Monster monster = MonsterFactory.createMonster();
        System.out.println("무시무시한 " + monster.getName() + "를 만났습니다.");

        while (true){
            if(player.isDead()) {
                System.out.println("\n분하다... 졌습니다.");
                return false;
            }

            if(monster.isDead()) {
                System.out.println("\n승리하였습니다!");
                return true;
            }

            System.out.println("\n===========================");
            System.out.println("일반공격[0]");
            System.out.println("고유스킬[1]");
            System.out.println("무기스킬[2]");
            System.out.println("장비스킬[3]");
            System.out.println("후퇴[4]");
            System.out.print("입력: ");
            int input = sc.nextInt();

            if(input < 0 || input > 4) {
                System.out.println("잘못된 번호 입니다.");
                continue;
            }

            if(input == 4) return false;
            System.out.println("=============================");

            player.startTurn(monster, input);
            monster.attack(player);
            System.out.printf("player HP : %s\nmonster HP : %s", player.getCurrentHp(), monster.getCurrentHp());
        }
    }
}
