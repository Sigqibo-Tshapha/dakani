package com.logitech.services.terminal;

import com.logitech.domain.terminal.Terminal;
import com.logitech.domain.terminal.TerminalState;
import com.logitech.domain.terminal.exception.TerminalNotFoundException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile("dev")
@Service
public class DevTerminalService implements ITerminalService{
    @Override
    public List<Terminal> findAll() {
        return List.of(new Terminal("Dev Terminal Location", TerminalState.INOPERATIONAL));
    }

    @Override
    public Terminal getTerminalById(int id) throws TerminalNotFoundException {
        return null;
    }

    @Override
    public Terminal saveTerminal(Terminal order) {
        return null;
    }

    @Override
    public Terminal updateTerminal(Terminal order) {
        return null;
    }
}
