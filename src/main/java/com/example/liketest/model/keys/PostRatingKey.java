package com.example.liketest.model.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*
 *
 * @author Roman Netesa
 *
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRatingKey  implements Serializable {
    @Column(name="user_id")
    private Integer userID;

    @Column(name="post_id")
    private Integer postID;
}
