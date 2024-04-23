package com.example.estimatorRules.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.estimatorRules.dto.Person;
import com.example.estimatorRules.service.PersonService;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person")
    public Person evaluatePerson(@RequestBody Person person) {
        return personService.evaluatePerson(person);
    }
}
