package com.adneom.service;

import com.adneom.usersoa.domain.User;

import java.util.List;

/**
 * Created by kermit on 18/11/2018.
 */
public interface UserService {
    public List<User> findAll();
    public List<User> save(List<User> users);
}
