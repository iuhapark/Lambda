package com.dennis.api.enums;

import java.util.Scanner;
import java.util.function.Predicate;

public enum MenuRouter {
    ;
    private final String name;
    private final Predicate<Scanner> predicate;

    MenuRouter(String name, Predicate<Scanner> predicate) {
        this.name = name;
        this.predicate = predicate;
    }

    public static void execute(Scanner sc) {

    }
}
