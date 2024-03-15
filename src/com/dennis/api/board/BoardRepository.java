package com.dennis.api.board;

public class BoardRepository {

    private final static BoardRepository instance = new BoardRepository();

    private BoardRepository() {
    }

    public static BoardRepository getInstance() {
        return instance;
    }
}
