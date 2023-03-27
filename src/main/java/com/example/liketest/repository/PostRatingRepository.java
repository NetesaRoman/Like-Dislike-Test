package com.example.liketest.repository;

import com.example.liketest.model.PostRating;
import com.example.liketest.model.keys.PostRatingKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 *
 * @author Roman Netesa
 *
 */
@Repository
public interface PostRatingRepository extends CrudRepository<PostRating, PostRatingKey>{
}
