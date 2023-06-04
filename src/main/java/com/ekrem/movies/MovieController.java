package com.ekrem.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//First official REST API Controller
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController
{
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieService.AllMovies(), HttpStatus.OK);
    }
/*
    public List<Movie> getAllMovies(){
        return movieService.AllMovies();
    }*/



}
