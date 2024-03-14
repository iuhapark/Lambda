package com.dennis.api.user;

import java.sql.SQLException;
import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) throws SQLException {
        UserController ctrl = new UserController();
        String msg = ctrl.addUsers();

        while(true){
            System.out.println("x.Exit\n" +
                    "1.Sign up\n" +
                    "2.Sigh in\n" +
                    "3.Search ID\n" +
                    "4.Update password\n" +
                    "5.Delete account\n" +
                    "ls.User list\n" +
                    "7.Search name\n" +
                    "8.Search job\n" +
                    "9.Number of users\n" +
                    "touch.Create table\n" +
                    "rm.Delete table");
            switch (sc.next()){
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    System.out.println("1.Sign up");
                    msg = ctrl.save(sc);
                    System.out.println("Signing up "+msg);
                    break;
                case "2":
                    System.out.println("2.Sigh in");
                    System.out.println(ctrl.login(sc));
                    break;
                case "3":
                    System.out.println("3.Search ID");
                    System.out.println(ctrl.findUsers());
                    break;
                case "4":
                    System.out.println("4.Update password");
                    System.out.println(ctrl.updatePassword(sc));
                    break;
                case "5":
                    System.out.println("5.Delete account");
                    System.out.println(ctrl.deleteAccount(sc));
                    break;
                case "ls":
                    System.out.println("6.User list");
                    System.out.println(ctrl.findUsers());
                    break;
                case "7":
                    System.out.println("7.Search name");
                    break;
                case "8":
                    System.out.println("8.Search job");
                    break;
                case "9":
                    System.out.println("9.Number of users");
                    String numberOfUsers = ctrl.count();
                    System.out.println("Number of users:  "+numberOfUsers);
                    break;
                case "touch":
                    System.out.println("touch.Create table");
                    System.out.println(ctrl.createTable());
                    break;
                case "rm":
                    System.out.println("rm.Delete table");
                    System.out.println(ctrl.deleteTable());
                    break;
            }
        }
    }
}