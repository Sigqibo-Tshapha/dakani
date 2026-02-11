package com.logitech.repositories.terminal;

import com.logitech.domain.terminal.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITerminalRepository extends JpaRepository<Terminal, Long> {
}
