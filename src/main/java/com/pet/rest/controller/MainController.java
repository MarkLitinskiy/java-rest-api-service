package com.pet.rest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pet.rest.entity.*;
import com.pet.rest.repository.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

/*
Для того, чтобы класс мог работать с http запросами - кидаем на него аннотацию @RestController
Также создаём метод mainListener(), который будет принимать Get-запросы от HTTP. @GetMapping("путь,
                                                                        по которому будем принимать запрос")
ObjectMapper используется  для преобразования объектов Java в формат JSON (и наоборот).
@RequestParam - позволяет получать параметры в качестве переменных запроса
 */

@RestController
@Component
public class MainController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private PostsRepo posts;

    @Autowired
    private UsersRepo users;

    private final RestTemplate restTemplate;

    public MainController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/posts/{postId}")
    public Posts getPost(@PathVariable String postId) {
        try {
            return posts.save((Objects.requireNonNull(restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/" + postId, Posts.class))));
        } catch (NullPointerException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    @GetMapping("/users/{postId}")
    public Users getUser(@PathVariable String postId) {
       // TODO: Переделать с библиотекой Simple JSON
        //  https://www.youtube.com/watch?v=YKUqIo7iXtA
//        try {
//            Users user = objectMapper.readValue("https://jsonplaceholder.typicode.com/users/" + postId, Users.class);
//            users.save(user);
//            return user;
//        } catch (NullPointerException | JsonProcessingException e) {
//            System.err.println(e.getMessage());
//            return null;
//        }
        return null;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
