package com.example.liketest.service;

import com.example.liketest.model.Post;
import com.example.liketest.model.PostRating;
import com.example.liketest.model.User;
import com.example.liketest.model.keys.PostRatingKey;
import com.example.liketest.repository.PostRatingRepository;
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
    private final PostRatingRepository postRatingRepository;

    private final UserRepository userRepository;

    public void newRating(User user, Post post) {
        PostRating postRating;

        if (postRatingRepository.existsById(new PostRatingKey(user.getId(), post.getId()))) {
            postRating = postRatingRepository.findById(new PostRatingKey(user.getId(), post.getId())).get();
            postRating.setRating(postRating.getRating() + 1);
        }else {
            postRating = new PostRating();
            postRating.setId(new PostRatingKey(user.getId(), post.getId()));
            postRating.setRating(1);
            postRating.setUser(user);
            postRating.setPost(post);
        }

        postRatingRepository.save(postRating);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public Post addpost(Post post) {
        return postRepository.save(post);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public Post getPostById(Integer id) {
        return postRepository.findById(id).get();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }
}
