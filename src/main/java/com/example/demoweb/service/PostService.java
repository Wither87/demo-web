package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;
    @Autowired
    PostRepository postRepository;

    public PostService(){
        posts = new ArrayList<>();
//        posts.add(new Post((long)posts.size() ,"Никита Хотдог", new Date()));
//        posts.add(new Post((long)posts.size(), "Никита Шаурма", new Date()));
//        posts.add(new Post((long)posts.size(), "Никита", new Date()));
    }
    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text){
        long newId = posts.size();
        posts.add(new Post(newId, text, new Date()));
        Post post = new Post(newId, text, new Date());
        postRepository.save(post);
    }
}
