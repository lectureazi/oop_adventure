package com.mc.adventure.domain.event;

public enum EventEnum {
    BATTLE_EVENT(new BattleEvent()),
    EXP_EVENT(new ExpEvent()),
    ITEM_EVENT(new ItemEvent()),
    RESTORE_EVENT(new FoodEvent());

    private final Event event;

    EventEnum(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }
}
