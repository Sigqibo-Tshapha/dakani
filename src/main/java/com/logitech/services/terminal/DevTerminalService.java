package com.logitech.services.terminal;

import com.logitech.domain.terminal.Terminal;
import com.logitech.domain.terminal.TerminalState;
import com.logitech.domain.terminal.exception.TerminalNotFoundException;
import com.logitech.repositories.terminal.ITerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile("dev")
@Service
public class DevTerminalService implements ITerminalService{

    ITerminalRepository terminalRepository;

    @Autowired
    public DevTerminalService(ITerminalRepository terminalRepository) {
        this.terminalRepository = terminalRepository;
    }

    @Override
    public List<Terminal> findAll() {
        return List.of(new Terminal("Dev Terminal Location", TerminalState.INOPERATIONAL));
    }

    @Override
    public Terminal getTerminalById(Long id) throws TerminalNotFoundException {
        return terminalRepository.findById((id)).orElse(null);
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
