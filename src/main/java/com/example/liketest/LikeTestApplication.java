package com.example.liketest;

import com.example.liketest.model.Post;
import com.example.liketest.model.User;
import com.example.liketest.service.MainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@Slf4j
public class LikeTestApplication {

    @Autowired
    private MainService mainService;

    public static void main(String[] args) {
        SpringApplication.run(LikeTestApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void started(){
        User user = mainService.getUserById(1);
        Post post = mainService.getPostById(2);
        mainService.newRating(user, post);
    }

}
