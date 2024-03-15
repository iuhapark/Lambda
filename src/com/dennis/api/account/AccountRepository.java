package com.dennis.api.account;

public class AccountRepository {
    private final static AccountRepository instance = new AccountRepository();

    private AccountRepository() {
    }

    public static AccountRepository getInstance() {
        return instance;
    }


}
