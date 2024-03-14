package com.dennis.api.strategy;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public enum WeekendStrategy {
    Monday("1",i->"Monday"),
    Tuesday("2",i->"Tuesday"),
    Wednesday("3",i->"Wednesday"),
    Thursday("4",i->"Thursday"),
    Friday("5",i->"Friday"),
    Saturday("6",i->"Saturday"),
    Sunday("7",i->"Sunday"),
    Wrong("8",i->"Wrong")
    ;
private final String select;
private final Function<String, String> function;

    WeekendStrategy(String select, Function<String, String> function) {
        this.select = select;
        this.function = function;
    }


    public static String foo(Scanner sc) {
        System.out.println("1~7 입력: ");
        String bar = sc.next();
        return Stream.of(values())
                .filter(i->i.select.equals(bar))
                .findAny()
                .orElseGet(()->Wrong)
                .function.apply(bar);
    }
}
