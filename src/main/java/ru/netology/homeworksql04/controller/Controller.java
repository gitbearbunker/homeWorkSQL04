package ru.netology.homeworksql04.controller;

import ru.netology.homeworksql04.entity.Persons;
import ru.netology.homeworksql04.repository.PersonsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private final PersonsRepository personsRepository;

    public Controller(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersons(@RequestParam String city) {
        return personsRepository.getPersonsByCity(city);
    }
}