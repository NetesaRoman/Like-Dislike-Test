package com.example.liketest.repository;

import com.example.liketest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 *
 * @author Roman Netesa
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {


}
