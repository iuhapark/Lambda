package com.dennis.api.account;

import com.dennis.api.menu.MenuRepository;

public class AccountServiceImpl {
    private final static AccountServiceImpl instance = new AccountServiceImpl();

    private AccountServiceImpl() {
        repo = AccountRepository.getInstance();
    }

    public static AccountServiceImpl getInstance() {
        return instance;
    }

    private AccountRepository repo;
}
