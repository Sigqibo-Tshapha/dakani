package com.logitech.services.terminal;

import com.logitech.domain.terminal.Terminal;
import com.logitech.domain.terminal.exception.TerminalNotFoundException;
import com.logitech.repositories.terminal.ITerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile({"prod", "default"})
@Service
public class GarageTerminalService implements ITerminalService{
    ITerminalRepository terminalRepository;

    @Autowired
    public GarageTerminalService(ITerminalRepository terminalRepository) {
        this.terminalRepository = terminalRepository;
    }

    @Override
    public List<Terminal> findAll() {
        return terminalRepository.findAll();
    }

    @Override
    public Terminal getTerminalById(Long id) throws TerminalNotFoundException {
        Terminal t = terminalRepository.findById(Long.valueOf(id)).get();
        if (t.equals(null)) {
            throw new TerminalNotFoundException(id);
        }
        return t;
    }

    @Override
    public Terminal saveTerminal(Terminal terminal) {
        return terminalRepository.save(terminal);
    }

    @Override
    public Terminal updateTerminal(Terminal terminal) {
        return terminalRepository.save(terminal);
    }
}
