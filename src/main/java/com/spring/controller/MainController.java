package com.spring.controller;

import com.spring.model.PersonEntity;
import com.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {
    private PersonService service;

    @Autowired
    public MainController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewIndex(Model model) {
        return null;
    }

    @GetMapping("/new")
    public String viewNewPerson(@Valid Model model) {
        return null;
    }

    @PostMapping("/save")
    public String viewSavePerson(@ModelAttribute("person") PersonEntity person) {
        return null;
    }
}
