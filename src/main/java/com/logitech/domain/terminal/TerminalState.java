package com.logitech.domain.terminal;

public enum TerminalState {
    INOPERATIONAL(1, "Terminal inopperational"),
    OPERATIONAL(2, "Terminal available for hosting vehicles"),
    FULL(3, "Terminal full");

    private final int id;
    private final String state;


    TerminalState(int id, String state) {
        this.id = id;
        this.state = state;
    }
}
