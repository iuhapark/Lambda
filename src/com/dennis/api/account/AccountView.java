package com.dennis.api.account;

import com.dennis.api.enums.AccountRouter;

import java.util.Scanner;


public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();
        AccountRouter.execute(sc);

        while (AccountRouter.accountRoute(sc));
        }
    }
