package com.spring.service;

import com.spring.model.user.User;

public interface UserService {
    User findByName(String userName);

    void save(User user);
}
