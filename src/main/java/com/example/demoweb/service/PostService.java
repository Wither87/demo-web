package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;
    public PostService(){
        posts = new ArrayList<>();
        posts.add(new Post("Никита Хотдог", new Date()));
        posts.add(new Post("Никита Шаурма", new Date()));
        posts.add(new Post("Никита", new Date()));
    }
    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text){
        posts.add(new Post(text, new Date()));
    }
}
