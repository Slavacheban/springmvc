package com.spring.service;

import com.spring.exceptions.UserDontExcistException;
import com.spring.model.user.User;
import com.spring.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User findByName(String userName) {
        return userRepository.findByUserName(userName).orElseThrow(UserDontExcistException::new);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
