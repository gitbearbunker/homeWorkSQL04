package ru.netology.homeworksql04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import ru.netology.homeworksql04.entity.Persons;
import ru.netology.homeworksql04.repository.PersonsRepository;
import ru.netology.homeworksql04.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class Controller {
    private final PersonService personService;

    @Autowired
    public Controller(PersonService personService, PersonsRepository personsRepository) {
        this.personService = personService;
    }

    @GetMapping("/by-city")
    public List<Persons> getPersonsByCity(@RequestParam String city) {
        return personService.getPersonByCity(city);
    }

    @GetMapping("/by-age")
    public List<Persons> getPersonsByAge(@RequestParam int age) {
        return personService.getPersonByAge(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname) {
        return personService.getPersonByNameAndSurname(name, surname);
    }
}