package com.dennis.api.account;

import com.dennis.api.enums.Messenger;

import java.time.LocalDate;
import java.util.Scanner;

public class AccountController {
    AccountServiceImpl account;
    LocalDate localDate;

    private final static AccountController instance = new AccountController();

    AccountController() {
    }

    public static AccountController getInstance() {
        return instance;
    }
    public Messenger createAccount(Scanner sc){
        return account.save(Account.builder()
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build()
        );
    }

    public String deposit(Scanner sc) {
        return account.deposit(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String withdraw(Scanner sc) {
        return account.withdraw(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String getBalance() {
        return null;
    }

    public String delete(Scanner sc) {
        return account.delete(Account.builder().accountNumber(sc.next()).build());
    }
}
