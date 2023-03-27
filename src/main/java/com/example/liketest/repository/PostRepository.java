package com.example.liketest.repository;

import com.example.liketest.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 *
 * @author Roman Netesa
 *
 */
@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
}
