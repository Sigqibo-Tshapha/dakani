package com.logitech.domain.terminal.exception;

public class TerminalNotFoundException extends Exception{
    public TerminalNotFoundException(int id) {
        super("Terminal with ID:: " + id + ", not found in database.");
    }
}
