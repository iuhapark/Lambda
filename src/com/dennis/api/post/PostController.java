package com.dennis.api.post;

public class PostController {

    private final static PostController instance = new PostController();

    private PostController() {
        service = PostServiceImpl.getInstance();
    }

    public static PostController getInstance() {
        return instance;
    }
    private PostServiceImpl service;
}
