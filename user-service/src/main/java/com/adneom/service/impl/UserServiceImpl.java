package com.adneom.service.impl;

import com.adneom.repository.UserRepository;
import com.adneom.service.UserService;
import com.adneom.usersoa.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kermit on 18/11/2018.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> save(List<User> users) {
        return userRepository.saveAll(users);
    }
}
