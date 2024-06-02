package com.moskovsky.itService.controller;

import com.moskovsky.itService.model.Vacancy;
import com.moskovsky.itService.service.VacancyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VacancyController {
    @Autowired
    private VacancyDao vacancyDao;

    @PostMapping("/vacancy/save")
    public void save(@RequestBody Vacancy vacancy) {
        vacancyDao.save(vacancy);
    }

    @GetMapping("/vacancy/all")
    public List<Vacancy> getAllVacancies() {
        return vacancyDao.getAllVacancies();
    }

    @GetMapping("/vacancy/search")
    public List<Vacancy> searchVacancies(
            @RequestParam(required = false) Boolean company,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String specialist,
            @RequestParam(required = false) String experience,
            @RequestParam(required = false) String employment_type,
            @RequestParam(required = false) Boolean hasHigherEducation,
            @RequestParam(required = false) String workSchedule) {
        return vacancyDao.searchVacancies(company, title, description, city, specialist, experience, employment_type, hasHigherEducation, workSchedule);
    }


}