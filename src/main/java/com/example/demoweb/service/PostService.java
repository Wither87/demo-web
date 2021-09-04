package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> list = new ArrayList<>();
        list.add(new Post("Никита Хотдог", new Date()));
        list.add(new Post("Никита Шаурма", new Date()));
        list.add(new Post("Никита", new Date()));
        return list;
    }
}
