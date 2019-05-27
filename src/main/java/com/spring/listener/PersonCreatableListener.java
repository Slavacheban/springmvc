package com.spring.listener;

import com.spring.model.CreatableEntity;

import javax.persistence.PrePersist;
import java.time.LocalDate;

public class PersonCreatableListener {
    @PrePersist
    public void prePersist(CreatableEntity entity) {
        entity.setBirthday(LocalDate.now());
    }
}
