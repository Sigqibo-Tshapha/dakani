package com.dakani.farm.controllers;

import com.dakani.farm.services.AnimalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @RequestMapping("/animals")
    public String getBooks(Model model) {
        model.addAttribute("animals", animalService.findAll());
        return "animals";
    }
}
