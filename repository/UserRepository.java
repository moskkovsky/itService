package com.moskovsky.itService.repository;

import com.moskovsky.itService.model.Users;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
    Users findByEmail(String email);
    List<Users> findBySpecialist(String specialist);
}