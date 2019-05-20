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
import java.util.List;

@Controller
public class MainController {
    private PersonService service;

    @Autowired
    public MainController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewIndex(Model model) {
        List<PersonEntity> personList = service.findAll();
        model.addAttribute("listPersons", personList);
        return "index";
    }

    @GetMapping("/new")
    public String viewNewPerson(@Valid Model model) {
        PersonEntity personEntity = new PersonEntity();
        model.addAttribute("newPerson", personEntity);
        return "new_person";
    }

    @PostMapping("/save")
    public String viewUpdatePerson(@ModelAttribute("person") PersonEntity person) {
        service.updatePerson(person);
        return "update_person";
    }
}
