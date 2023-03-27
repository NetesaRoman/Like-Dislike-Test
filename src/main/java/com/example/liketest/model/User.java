package com.example.liketest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 *
 * @author Roman Netesa
 *
 */
@Entity
@Table(schema = "like_test")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ManyToMany( fetch = FetchType.EAGER)
    @JoinTable(schema = "like_test", name = "post_liked_users",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id"))
    private Set<Post> likedPosts = new HashSet<>();

    @ManyToMany( fetch = FetchType.EAGER)
    @JoinTable(schema = "like_test", name = "post_disliked_users",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id"))
    private Set<Post> dislikedPosts = new HashSet<>();


    public void addLikedPost(Post post) {
        likedPosts.add(post);
        post.getLikedUsers().add(this);
    }

    public void removeLikedPost(Post post) {
        likedPosts.remove(post);
        post.getLikedUsers().remove(this);
    }

    public void addDislikedPost(Post post) {
        likedPosts.add(post);
        post.getLikedUsers().add(this);
    }

    public void removeDislikedPost(Post post) {
        likedPosts.remove(post);
        post.getLikedUsers().remove(this);
    }
}
