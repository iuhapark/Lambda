package com.dennis.api.user;

import com.dennis.api.enums.Messenger;

import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    String addUsers();
    String login(User build);
    String updatePassword(User user);
    User findUserByName(Scanner sc);
    User findUserById(Scanner sc);
    Map userList();
    String deleteAccount(Scanner sc);
    Messenger createTable() throws SQLException;
    String deleteTable() throws SQLException;
}
