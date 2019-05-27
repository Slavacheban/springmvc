package com.spring.model;

import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "persons")
@Accessors(chain = true)
public class PersonEntity extends CreatableEntity {
    private String name;
    private String email;
}
