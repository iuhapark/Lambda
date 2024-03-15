package com.dennis.api.enums;

import com.dennis.api.crawler.CrawlerVIew;
import com.dennis.api.user.UserView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;


public enum NavigationOfPredicate {


    x("x", i -> {
        System.out.println("EXIT");
        return false;
    }),
    u("u", i -> {
        System.out.println("User");
        try {
            UserView.main(i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    a("a", i -> {
        System.out.println("Post");
//        PostVIew.main(i);
        return true;
    }),
    b("b", i -> {
        System.out.println("Board");
//        BoardVIew.main(i);
        return true;
    }),
    ac("ac", i -> {
        System.out.println("Account");
//        AccountVIew.main(i);
        return true;
    }),
    c("c", i -> {
        System.out.println("Crawler");
        try {
            CrawlerVIew.main(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    });


    private final String menu;
    private final Predicate<Scanner> predicate;

    NavigationOfPredicate(String menu, Predicate<Scanner> predicate) {
        this.menu = menu;
        this.predicate = predicate;
    }
    public static Boolean navigate(Scanner sc) {
        System.out.println("x-Exit " +
                "u.User " +
                "p.Post " +
                "b-Board " +
                "a-Account " +
                "c-Crawler ");
        String msg = sc.next();
        return Stream.of(values())
                .filter(i -> i.menu.equals(msg))
                .findAny().orElseThrow(() -> new IllegalArgumentException("잘못된 입력입니다.")).predicate.test(sc);
    }
}
