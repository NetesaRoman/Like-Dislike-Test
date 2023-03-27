package com.example.liketest.model.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

/*
 *
 * @author Roman Netesa
 *
 */
@Embeddable
@Data
public class PostRatingKey  implements Serializable {
    @Column(name="user_id")
    private Integer userID;

    @Column(name="post_id")
    private Integer postID;
}
