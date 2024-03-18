package com.dennis.api.account;

import com.dennis.api.enums.Messenger;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    String deposit(Account account);
    String withdraw(Account account);
    String getBalance(String accountNumber);

    String delete(Account account);

    String deleteAll();

    Boolean existsById(Long id);

    Messenger save(Account account);

    List<Account> findAll();

    Optional<Account> findById(Long id);

    String count();

    Optional<Account> getOne(String id);
}
