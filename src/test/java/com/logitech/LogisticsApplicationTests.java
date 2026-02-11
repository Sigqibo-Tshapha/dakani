package com.logitech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class LogisticsApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testAnimalService() {

//		AnimalService animalService = (AnimalService) applicationContext.getBean("animalServiceMain");
//		System.out.println(animalService.findAll());
	}

	@Test
	void contextLoads() {
		System.out.println("-------------->Logitech loaded successfully.");
	}

}
