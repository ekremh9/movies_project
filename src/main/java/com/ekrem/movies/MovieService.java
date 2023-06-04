package com.ekrem.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired //it lets the framework know to instantiate this class for us
    private MovieReporitory movieRepository;
    public List<Movie> AllMovies(){
        return movieRepository.findAll();
    }
}
