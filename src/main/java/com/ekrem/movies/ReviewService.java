package com.ekrem.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository; //DB
    @Autowired
    private MongoTemplate mongoTemplate; //used to form a new dynamic query and do the job inside the DB without using the repository
    public Review createReview(String reviewBody, String imdbId){
       // Review review = new Review(reviewBody);
        //reviewRepository.insert(review);
        Review review = reviewRepository.insert(new Review(reviewBody));

        //Update a single entity in MongoDB per imdbId with the appropriate review
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review)) //value will be pushed inside the reviewIds array in our DB Movie entity
                .first(); //we're getting the first movie and update that one

        return review;
    }
}
