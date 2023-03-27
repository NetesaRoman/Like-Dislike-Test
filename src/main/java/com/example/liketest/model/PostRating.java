package com.example.liketest.model;

import com.example.liketest.model.keys.PostRatingKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 *
 * @author Roman Netesa
 *
 */
@Entity
@Table(schema = "like_test", name = "post_rating")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
