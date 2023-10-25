package ru.netology.homeworksql04.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERSONS")
@Entity
public class Persons {
    @EmbeddedId
    private PersonKey personKey;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String cityOfLiving;

}