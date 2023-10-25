package ru.netology.homeworksql04.repository;

import ru.netology.homeworksql04.entity.Persons;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
//@AllArgsConstructor
public class PersonsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city){
        var query = entityManager.createQuery("select p from Persons p where lower(p.cityOfLiving) = lower(:city)", Persons.class);
        query.setParameter("city",city);
        return query.getResultList();

    }
}