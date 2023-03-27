package com.example.liketest.service;

import com.example.liketest.model.Post;
import com.example.liketest.model.User;
import com.example.liketest.repository.PostRepository;
import com.example.liketest.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *
 * @author Roman Netesa
 *
 */
@Service
@RequiredArgsConstructor
public class MainService {

    private final PostRepository postRepository;


    private final UserRepository userRepository;

    public User like(User user, Post post){
        user.addLikedPost(post);
        user.removeDislikedPost(post);

        postRepository.save(post);
        return  userRepository.save(user);
    }

    public void dislike(User user, Post post){
        user.addDislikedPost(post);
        user.removeLikedPost(post);
        userRepository.save(user);
        postRepository.save(post);
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public Post addpost(Post post){
        return postRepository.save(post);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }

    public Post getPostById(Integer id){
        return postRepository.findById(id).get();
    }

    public User getUserById(Integer id){
        return userRepository.findById(id).get();
    }
}
