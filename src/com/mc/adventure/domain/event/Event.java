package com.mc.adventure.domain.event;

import com.mc.adventure.domain.character.player.Player;

public interface Event {
    boolean occur(Player player);
}
