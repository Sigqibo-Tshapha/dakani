package com.logitech.services.terminal;

import com.logitech.domain.terminal.Terminal;
import com.logitech.domain.terminal.exception.TerminalNotFoundException;
import com.logitech.repositories.terminal.ITerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ITerminalService {
    public List<Terminal> findAll();

    Terminal getTerminalById(int id) throws TerminalNotFoundException;

    Terminal saveTerminal(Terminal order);
    Terminal updateTerminal(Terminal order);
}
