package com.dennis.api.enums;

import java.util.Scanner;
import java.util.function.Predicate;

public enum UserRouter {
    ;

    private final String name;
    private final Predicate<Scanner> predicate;

    UserRouter(String name, Predicate<Scanner> predicate) {
        this.name = name;
        this.predicate = predicate;
    }

    public static void execute(Scanner sc) {

    }
}
