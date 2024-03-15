package com.dennis.api.board;

public class BoardController {
    private final static BoardController instance = new BoardController();

    private BoardController() {
    }

    public static BoardController getInstance() {
        return instance;
    }
}
