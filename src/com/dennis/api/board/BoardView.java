package com.dennis.api.board;

import com.dennis.api.enums.BoardRouter;

import com.dennis.api.common.UtilService;
import com.dennis.api.common.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardView {
    public static void main(Scanner sc) {
        List<Board> posts = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();
        BoardRouter.execute(sc);

    }
}
