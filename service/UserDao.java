package com.moskovsky.itService.service;

import com.moskovsky.itService.model.Users;
import com.moskovsky.itService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDao {

    @Autowired
    private UserRepository repository;

    public void save(Users user) {
        repository.save(user);
    }

    public boolean userExistsByEmail(String email) {
        return repository.findByEmail(email) != null;
    }

    public List<Users> getAllUsers() {
        List<Users> users = new ArrayList<>();
        repository.findAll().forEach(users::add);
        return users;
    }

    public List<Users> getUsersBySpecialist(String specialist) {
        return repository.findBySpecialist(specialist);
    }
}