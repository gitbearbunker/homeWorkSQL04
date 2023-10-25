package ru.netology.homeworksql04.service;

import ru.netology.homeworksql04.entity.Persons;
import ru.netology.homeworksql04.repository.PersonsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class PersonService {
    private final PersonsRepository personsCrudRepository;


    @Autowired
    public PersonService(PersonsRepository personsCrudRepository) {
        this.personsCrudRepository = personsCrudRepository;
    }

    public List<Persons> getPersonByCity(String city) {
        return personsCrudRepository.findAllByCityOfLiving(city);
    }

    public List<Persons> getPersonByAge(int age) {
        return personsCrudRepository.findByPersonKey_AgeIsLessThanOrderByPersonKeyAgeAsc(age);
    }

    public Optional<Persons> getPersonByNameAndSurname(String name, String surname) {
        return personsCrudRepository.findByPersonKey_NameAndPersonKey_Surname(name, surname);
    }
}