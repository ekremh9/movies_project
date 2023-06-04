package com.ekrem.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //now the framework knows its a repository
public interface MovieReporitory extends MongoRepository<Movie, ObjectId> { //search per ObjectId (id) is extended from MongoRepository

    //since search per imdbid does not exist from the extended interface, we can easily implement that method
     Optional<Movie> findMovieByImdbId(String imdbId);
     //SpringDataMongoDb can udnerstand what we want to do, and we dont have to implement the whole class!!
    //Same property name here in FindClassByProperty_Name


}
