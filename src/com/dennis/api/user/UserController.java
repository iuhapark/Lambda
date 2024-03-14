package com.dennis.api.user;

import com.dennis.api.enums.Messenger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class UserController {
    private static UserController instance = new UserController();

    public static UserController getInstance() {
        return instance;
    }

    UserServiceImpl user;
    UserRepository repo;
    UserController(){
        this.user = UserServiceImpl.getInstance();
        this.repo = UserRepository.getInstance();
    }

    public List<?> findUsers() throws SQLException {return repo.findUsers();}


    public String save(Scanner sc) {
        System.out.println("Please enter Username, Password, Name, Phone Number, Address, Job, Height, Weight.");
        user.save(User.builder()
                .username(sc.next())
                .password(sc.next())
                .name(sc.next())
                .phoneNumber(sc.next())
                .addressId(sc.next())
                .job(sc.next())
                .height(sc.nextDouble())
                .weight(sc.nextDouble())
                .build());
        return "Thanks for signing up. Your account has been created." ;
    }

    public String addUsers() {
        return user.addUsers();
    }

    public String count() {
        return user.count();
    }

    public Map userList() {
        return user.userList();
    }

    public String login(Scanner sc) {
        System.out.println("Please enter Username, password.");
        return user.login(User.builder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String updatePassword(Scanner sc) {
        return user.updatePassword(User.builder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String deleteAccount(Scanner sc) {
        System.out.println("삭제할 계정의 아이디, 비밀번호를 입력해 주세요.");
        user.delete(User.builder()
                .username(sc.next())
                .password(sc.next())
                .build());
        return "계정이 삭제되었습니다.";
    }

    public Optional<User> getOne(Scanner sc) {return user.getOne(sc.next());
    }

    public Messenger createTable() throws SQLException {
        return user.createTable();
    }

    public String deleteTable() throws SQLException {
        return user.deleteTable();
    }

}