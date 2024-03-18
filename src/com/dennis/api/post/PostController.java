package com.dennis.api.post;

import java.util.List;

public class PostController {
    private PostServiceImpl service;

    private final static PostController instance = new PostController();

    public PostController() {
        service = PostServiceImpl.getInstance();
    }

    public static PostController getInstance() {
        return instance;
    }

    public List<?> findAll() {
        return service.findAll();
    }

}
