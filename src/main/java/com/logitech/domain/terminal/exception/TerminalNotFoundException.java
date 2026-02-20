package com.logitech.domain.terminal.exception;

public class TerminalNotFoundException extends Exception{
    public TerminalNotFoundException(Long id) {
        super("Terminal with ID:: " + id + ", not found in database.");
    }
}
