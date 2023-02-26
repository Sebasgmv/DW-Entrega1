package org.example.persistencia.init;

import java.util.ArrayList;
import java.util.List;

import org.example.persistencia.model.Person;
import org.example.persistencia.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInitializer implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", "Doe", "john.doe@example.com"));
        persons.add(new Person("Jane", "Doe", "jane.doe@example.com"));
        persons.add(new Person("Bob", "Smith", "bob.smith@example.com"));
        persons.add(new Person("Alice", "Johnson", "alice.johnson@example.com"));
        persons.add(new Person("Tom", "Jones", "tom.jones@example.com"));
        persons.add(new Person("Emily", "Wilson", "emily.wilson@example.com"));
        persons.add(new Person("David", "Lee", "david.lee@example.com"));
        persons.add(new Person("Lucy", "Chen", "lucy.chen@example.com"));
        persons.add(new Person("Michael", "Wang", "michael.wang@example.com"));
        persons.add(new Person("Grace", "Zhang", "grace.zhang@example.com"));

        personRepository.saveAll(persons);
    }

}
