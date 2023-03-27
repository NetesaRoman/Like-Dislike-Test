package com.example.liketest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
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
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "likedPosts")
    private Set<User> likedUsers = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "dislikedPosts")
    private Set<User> dislikedUsers = new HashSet<>();




}
