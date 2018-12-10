package com.adneom.web;

import com.adneom.service.UserService;
import com.adneom.usersoa.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kermit on 18/11/2018.
 */
@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/find-all", method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        List<User> allUsers = userService.findAll();
        ResponseEntity<List<User>> entity = new ResponseEntity<>(allUsers, HttpStatus.OK);
        return entity;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<List<User>> save(@RequestBody List<User> users) {
        List<User> allUsers = userService.save(users);
        ResponseEntity<List<User>> entity = new ResponseEntity<>(allUsers, HttpStatus.OK);
        return entity;
    }

}
