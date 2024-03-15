package com.dennis.api.post;

public class PostServiceImpl {
    private final static PostServiceImpl instance = new PostServiceImpl();

    private PostServiceImpl() {
        repo = PostRepository.getInstance();
    }

    public static PostServiceImpl getInstance() {
        return instance;
    }
    private PostRepository repo;
}
