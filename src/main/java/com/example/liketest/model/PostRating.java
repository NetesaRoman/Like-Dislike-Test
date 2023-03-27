package com.example.liketest.model;

import com.example.liketest.model.keys.PostRatingKey;
import jakarta.persistence.*;

/*
 *
 * @author Roman Netesa
 *
 */
@Entity
@Table(schema = "like_test", name = "post_rating")
public class PostRating {

    @EmbeddedId
    private PostRatingKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("postId")
    @JoinColumn(name = "post_id")
    private Post post;

    private int rating;
}
