package com.example.estimatorRules.service;

import org.springframework.stereotype.Service;
import com.example.estimatorRules.model.Person;

@Service
public class PersonService {

    public Person evaluatePerson(Person person) {
        if (person.getAge() >= 18) {
            person.setAdult(true);
        } else {
            person.setAdult(false);
        }
        return person;
    }
}
