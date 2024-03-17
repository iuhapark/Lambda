package com.dennis.api.account;

public class AccountServiceImpl {
    private final static AccountServiceImpl instance = new AccountServiceImpl();

    private AccountServiceImpl() {
    }

    public static AccountServiceImpl getInstance() {
        return instance;
    }
}
