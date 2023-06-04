package com.ekrem.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository //now the framework knows its a repository
public interface MovieReporitory extends MongoRepository<Movie, ObjectId> {

}
