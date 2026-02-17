package com.logitech;

import com.logitech.services.terminal.DevTerminalService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("dev")
@SpringBootTest
class LogisticsApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testTerminalService() {
		DevTerminalService terminalService = (DevTerminalService) applicationContext.getBean("DevTerminalService");
		System.out.println(terminalService.findAll());
	}

	@Test
	void contextLoads() {
		System.out.println("-------------->Logitech loaded successfully.");
	}

}
