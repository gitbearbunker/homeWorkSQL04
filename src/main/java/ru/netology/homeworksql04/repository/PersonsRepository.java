package ru.netology.homeworksql04.repository;

import ru.netology.homeworksql04.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, PersonKey> {
    List<Persons> findAllByCityOfLiving(String cityOfLiving);

    List<Persons> findByPersonKey_AgeIsLessThanOrderByPersonKeyAgeAsc(int age);

    Optional<Persons> findByPersonKey_NameAndPersonKey_Surname(String name, String surname);
}