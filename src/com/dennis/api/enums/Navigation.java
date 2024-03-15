package com.dennis.api.enums;

import com.dennis.api.crawler.CrawlerVIew;
import com.dennis.api.user.UserView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum Navigation {

    ;

    private final String name;
    private final Predicate<Scanner> predicate;

    Navigation(String name, Predicate<Scanner> predicate) {
        this.name = name;
        this.predicate = predicate;
    }

    public static void execute(Scanner sc) {
        System.out.println();

    }
}