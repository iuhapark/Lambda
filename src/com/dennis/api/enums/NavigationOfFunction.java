package com.dennis.api.enums;

import com.dennis.api.account.AccountVIew;
import com.dennis.api.board.BoardVIew;
import com.dennis.api.crawler.CrawlerVIew;
import com.dennis.api.post.PostVIew;
import com.dennis.api.user.UserView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public enum NavigationOfFunction {
    Exit("x", scanner -> "x"),
    User("u", scanner -> {
        try {
            UserView.main(scanner);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "";
    }),
    Post("a", scanner -> {
        PostVIew.main(scanner);
        return "";
    }),
    Board("b", scanner -> {
        BoardVIew.main(scanner);
        return "";
    }),
    Account("ac", scanner -> {
        AccountVIew.main(scanner);
        return "";
    }),
    Crawler("c", scanner -> {
        try {
            CrawlerVIew.main(scanner);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";
    });

    private final String menu;
    private final Function<Scanner, String> function;

    NavigationOfFunction(String menu, Function<Scanner, String> function) {
        this.menu = menu;
        this.function = function;
    }

    public static String select(Scanner input) {
        System.out.println("=== x-Exit " +
                "u-User " +
                "a-Article " +
                "b-Board " +
                "ac-Account " +
                "c-Crawler " +
                "===");
        String msg = input.next();
        return Stream.of(values())
                .filter(i -> i.menu.equals(msg))
                .findAny().orElseThrow(() -> new IllegalArgumentException("잘못된 입력입니다.")).function.apply(input);
    }
}