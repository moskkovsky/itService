package com.moskovsky.itService.controller;

import com.moskovsky.itService.model.FavoriteHR;
import com.moskovsky.itService.service.FavoriteHRDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FavoriteHRController {
        @Autowired
        private FavoriteHRDao favoriteHRDao;

        @GetMapping("favhr/get-all")
        public List<FavoriteHR> getAppFavorite() {
            return favoriteHRDao.getAllFavorite();
        }

        @PostMapping("/favhr/save")
        public void save(@RequestBody FavoriteHR favorite) {
            favoriteHRDao.save(favorite);
        }

        @PostMapping("/favhr/delete")
        public void deleteFavoriteBook(@RequestParam String title) {
            favoriteHRDao.deleteByTitle(title);
        }
}
