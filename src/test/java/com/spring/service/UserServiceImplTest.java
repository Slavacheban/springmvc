package com.spring.service;

import com.spring.model.user.Role;
import com.spring.model.user.User;
import lombok.AllArgsConstructor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Collections;

import static junit.framework.TestCase.assertTrue;

@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImplTest {
    private final UserService service;

    @Test
    public void shouldFindByName() {
        User user = new User();
        user.setLogin("slava")
                .setRoles(Collections.singleton(Role.ADMIN))
                .setPassword("12345");
        service.save(user);
        assertTrue(service.findByName("slava").getId().equals(1L));
    }

    @Test
    public void shouldSaveUser() {
        User user = new User();
        user.setLogin("slava")
                .setRoles(Collections.singleton(Role.ADMIN))
                .setPassword("12345");
        service.save(user);
        assertTrue(service.findByName("slava").getLogin().equals("slava"));
    }
}