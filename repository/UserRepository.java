package com.moskovsky.itService.repository;

import com.moskovsky.itService.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
    Users findByEmail(String email);

    List<Users> findBySpecialist(String specialist);

    @Query("SELECT u FROM Users u WHERE " +
            "(:name IS NULL OR u.name = :name) AND " +
            "(:surname IS NULL OR u.surname = :surname) AND " +
            "(:password IS NULL OR u.password = :password) AND " +
            "(:telegram IS NULL OR u.telegram = :telegram) AND " +
            "(:age IS NULL OR u.age = :age) AND " +
            "(:experience IS NULL OR u.experience = :experience) AND " +
            "(:city IS NULL OR u.city = :city) AND " +
            "(:education IS NULL OR u.education = :education) AND " +
            "(:email IS NULL OR u.email = :email) AND " +
            "(:hasHigherEducation IS NULL OR u.hasHigherEducation = :hasHigherEducation) AND " +
            "(:workSchedule IS NULL OR u.workSchedule = :workSchedule) AND " +
            "(:experienceDescription IS NULL OR u.experienceDescription = :experienceDescription) AND " +
            "(:employmentType IS NULL OR u.employmentType = :employmentType) AND " +
            "(:specialist IS NULL OR u.specialist = :specialist) AND " +
            "(:selectedTechnologies IS NULL OR u.selectedTechnologies IN :selectedTechnologies)")
    List<Users> findByFilters(@Param("name") String name,
                              @Param("surname") String surname,
                              @Param("password") String password,
                              @Param("telegram") String telegram,
                              @Param("age") String age,
                              @Param("experience") String experience,
                              @Param("city") String city,
                              @Param("education") String education,
                              @Param("email") String email,
                              @Param("hasHigherEducation") Boolean hasHigherEducation,
                              @Param("workSchedule") String workSchedule,
                              @Param("experienceDescription") String experienceDescription,
                              @Param("employmentType") String employmentType,
                              @Param("specialist") String specialist,
                              @Param("selectedTechnologies") List<String> selectedTechnologies);
}