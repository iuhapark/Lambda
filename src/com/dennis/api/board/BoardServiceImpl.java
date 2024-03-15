package com.dennis.api.board;

public class BoardServiceImpl {
    private final static BoardServiceImpl instance = new BoardServiceImpl();

    private BoardServiceImpl() {
        repo = BoardRepository.getInstance();
    }

    public static BoardServiceImpl getInstance() {
        return instance;
    }
    private BoardRepository repo;
}
