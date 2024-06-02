package com.moskovsky.itService.service;

import com.moskovsky.itService.model.FavoriteHR;
import com.moskovsky.itService.repository.FavoriteHRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FavoriteHRDao {
    @Autowired
    private FavoriteHRRepository repository;

    public void save(FavoriteHR favorite) {
        repository.save(favorite);
    }

    public List<FavoriteHR> getAllFavorite() {
        List<FavoriteHR> favorites = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(favorites::add);
        return favorites;
    }

    public void deleteByTitle(String email) {
        FavoriteHR favorite = repository.findByEmail(email);
        if (favorite != null) {
            repository.delete(favorite);
        } else {

        }
    }
}
