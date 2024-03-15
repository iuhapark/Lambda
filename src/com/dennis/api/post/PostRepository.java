package com.dennis.api.post;

public class PostRepository {

    private final static PostRepository instance = new PostRepository();

    private PostRepository() {
    }

    public static PostRepository getInstance() {
        return instance;
    }
}
