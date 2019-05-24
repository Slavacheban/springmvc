package com.spring.controller;

import com.spring.model.PersonEntity;
import com.spring.model.user.User;
import com.spring.service.PersonService;
import com.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MainController {
    private PersonService service;
    private UserService userService;

    @GetMapping("/")
    public String viewIndex(Model model) {
        List<PersonEntity> personList = service.findAll();
        model.addAttribute("listPersons", personList);
        return "index";
    }

    @PostMapping("/")
    public ModelAndView loginOrRegistrate(User user, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        User u = userService.findByName(user.getLogin());
        if (Objects.nonNull(u)) {
            bindingResult.rejectValue("userName", "error.user", "User is registered");
            modelAndView.setViewName("login");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            userService.save(u);
            modelAndView.addObject("successMessage", "User was registered")
                    .addObject("user", new User())
                    .setViewName("registration");
        }
        return modelAndView;
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
        return "redirect:/";
    }
}
