package com.moskovsky.itService.repository;

import com.moskovsky.itService.model.FavoriteHR;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteHRRepository extends CrudRepository<FavoriteHR, Integer> {
    FavoriteHR findByEmail(String email);
}

