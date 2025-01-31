package com.mc.adventure.domain.stage;

import com.mc.adventure.domain.adventure.Adventure;
import com.mc.adventure.domain.character.player.Player;

public class Stage {

    private final Player player;
    private final int stageNumber;

    public Stage(Player player, int stageNumber) {
        this.player = player;
        this.stageNumber = stageNumber;
    }

    public boolean start(){
        Adventure adventure = new Adventure();
        System.out.println(stageNumber + " 스테이지 시작합니다.");
        boolean isClear = adventure.go(player);

        if(isClear){
            System.out.println("다음 스테이지로 넘어갑니다.");
            return true;
        }

        System.out.println("패배");
        return false;

    }
}
