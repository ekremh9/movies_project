package com.ekrem.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.objenesis.ObjenesisHelper;

@Document(collection = "reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    private ObjectId id; //autogenerated,means we cannot initialize it, this is why those above 2 constructors wont work, we need a new one
    private String body;

    public Review(String body) {
        this.body = body;
    }
}
