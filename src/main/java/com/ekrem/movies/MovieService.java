package com.ekrem.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired //it lets the framework know to instantiate this class for us
    private MovieReporitory movieRepository;
    public List<Movie> AllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){ //returns NULL if movie per id does not exist in db
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
