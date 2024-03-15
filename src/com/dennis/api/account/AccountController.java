package com.dennis.api.account;

public class AccountController {
    private final static AccountController instance = new AccountController();

    private AccountController() {
    service = AccountServiceImpl.getInstance();
    }

    public static AccountController getInstance() {
        return instance;
    }

    private AccountServiceImpl service;
}
