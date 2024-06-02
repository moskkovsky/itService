package com.moskovsky.itService.controller;

import com.moskovsky.itService.model.Users;
import com.moskovsky.itService.model.Vacancy;
import com.moskovsky.itService.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/get-all")
    public List<Users> getAllUsers() {
        return userDao.getAllUsers();
    }

    @PostMapping("/user/save")
    public void save(@RequestBody Users user) {
        userDao.save(user);
    }

    @GetMapping("/user/get-by-specialist")
    public List<Users> getUsersBySpecialist(@RequestParam String specialist) {
        return userDao.getUsersBySpecialist(specialist);
    }
    @GetMapping("/user/search")
    public List<Users> searchVacancies(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String surname,
            @RequestParam(required = false) String password,
            @RequestParam(required = false) String telegram,
            @RequestParam(required = false) String age,
            @RequestParam(required = false) String experience,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String education,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) Boolean hasHigherEducation,
            @RequestParam(required = false) String workSchedule,
            @RequestParam(required = false) String experienceDescription,
            @RequestParam(required = false) String employmentType,
            @RequestParam(required = false) String specialist,
            @RequestParam(required = false) List<String> selectedTechnologies
    ) {

    }












}