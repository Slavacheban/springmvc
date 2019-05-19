package com.spring.model;

import com.spring.listener.PersonCreatableListener;
import lombok.Setter;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
@Setter
@EntityListeners(value = PersonCreatableListener.class)
public class CreatableEntity extends BaseEntity {
    private LocalDate birthday;
}
