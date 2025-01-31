package com.mc.adventure.presentation;

import com.mc.adventure.domain.adventure.Adventure;
import com.mc.adventure.domain.character.player.Player;
import com.mc.adventure.domain.skill.Skill;
import com.mc.adventure.domain.skill.SkillGroup;
import com.mc.adventure.domain.stage.Stage;

import java.util.Scanner;

public class Menu {

    public void menu(){

        Scanner sc = new Scanner(System.in);
        System.out.println("\n==================================\n");
        System.out.print("캐릭터 이름을 입력하세요: ");
        String nickName = sc.nextLine();
        System.out.println("캐릭터 고유스킬을 선택하세요 ");

        for (int i = 0; i < SkillGroup.values().length; i++) {
            Skill skill = SkillGroup.values()[i].skill();
            System.out.printf("%-10s [%d]\n", skill.getName(), i);
        }

        System.out.print("입력: ");
        int input = sc.nextInt();
        Skill skill = SkillGroup.values()[input].skill();

        Player player = new Player(nickName, 100, 30, 5, skill);
        System.out.println("\n==================================\n");

        for (int i = 1; i < 3; i++) {
            Stage stage = new Stage(player, i);
            boolean isClear = stage.start();
            if (!isClear) break;
        }
    }
}
