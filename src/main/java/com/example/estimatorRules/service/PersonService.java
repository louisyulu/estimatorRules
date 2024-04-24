package com.example.estimatorRules.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.example.estimatorRules.model.Person;

@Service
public class PersonService {

    private final KieContainer kieContainer;

    public PersonService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Person evaluatePerson(Person person) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(person);
        kieSession.fireAllRules();
        kieSession.dispose();
        return person;
    }
}
