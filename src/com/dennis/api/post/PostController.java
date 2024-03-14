package com.dennis.api.post;

import java.util.List;

public class PostController {
    private PostServiceImpl service;

    public PostController(){
        this.service = PostServiceImpl.getInstance();
    }

    public List<?> findAll() {
        return service.findAll();
    }


}

