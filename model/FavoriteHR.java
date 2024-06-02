package com.moskovsky.itService.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "favoritehr")
@Entity
public class FavoriteHR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String password;

    private String telegram;
    private String age = "";
    private String experience = "";
    private String city = "";
    private String education = "";
    private String email;
    private Boolean hasHigherEducation = false;

    private String workSchedule = "";

    private String experienceDescription = "";

    private String employmentType = "";

    private String specialist = "";

    @ElementCollection
    private List<String> selectedTechnologies = new ArrayList<>();

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getHasHigherEducation() {
        return hasHigherEducation;
    }

    public void setHasHigherEducation(Boolean hasHigherEducation) {
        this.hasHigherEducation = hasHigherEducation;
    }

    public String getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }

    public String getExperienceDescription() {
        return experienceDescription;
    }

    public void setExperienceDescription(String experienceDescription) {
        this.experienceDescription = experienceDescription;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public List<String> getSelectedTechnologies() {
        return selectedTechnologies;
    }

    public void setSelectedTechnologies(List<String> selectedTechnologies) {
        this.selectedTechnologies = selectedTechnologies;
    }
}
