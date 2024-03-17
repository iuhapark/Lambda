package com.dennis.api.enums;

import com.dennis.api.account.AccountController;

import java.util.Scanner;
import java.util.function.Predicate;

public enum AccountRouter {
    EXIT("x",sc -> {
        return false;
    }),
    CREATEACCOUNT("touch",sc->{
        return true;
    }),
    DELETEACCOUNT("rm",sc->{
        return true;
    }),


    ;
    private final String name;
    private final Predicate<Scanner> predicate;

    AccountRouter(String name, Predicate<Scanner> predicate) {
        this.name = name;
        this.predicate = predicate;
    }

    public static void execute(Scanner sc) {
    }
}
