package com.dennis.api.strategy;

import java.util.Scanner;

public class Weekend { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String har = WeekendStrategy.foo(sc);
    System.out.println("전략의 결과: "+ har);
}

    private static void foo(String day) {
        System.out.println("1~7 입력: ");
        String res = "";
        switch (day) {
            case "1":
                res = "Monday";
                break;
            case "2":
                res = "Tuesday";
                break;
            case "3":
                res = "Wednesday";
                break;
            case "4":
                res = "Thursday";
                break;
            case "5":
                res = "Friday";
                break;
            case "6":
                res = "Saturday";
                break;
            case "7":
                res = "Sunday";
                break;
            default:
                System.out.println("Wrong");
                return;
        }
        System.out.println(res);
    }

}