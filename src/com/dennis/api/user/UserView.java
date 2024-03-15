package com.dennis.api.user;

import com.dennis.api.enums.Navigation;
import com.dennis.api.enums.UserRouter;

import java.sql.SQLException;
import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) throws SQLException {
        UserController ctrl = new UserController();
//        execute(sc, ctrl);
        UserRouter.execute(sc);

    }

    private static void execute(Scanner sc, UserController ctrl) throws SQLException {
        String msg = ctrl.addUsers();
        while (true) {
            System.out.println("x.Exit\n" +
                    "su.Sign up\n" +
                    "si.Sigh in\n" +
                    "fu.Search username\n" +
                    "u.Update password\n" +
                    "d.Delete account\n" +
                    "ls.User list\n" +
                    "fn.Search name\n" +
                    "fj.Search job\n" +
                    "n.Number of users\n" +
                    "touch.Create table\n" +
                    "rm.Delete table");
            switch (sc.next()) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println("1.Sign up");
                    msg = ctrl.save(sc);
                    System.out.println("Signing up " + msg);
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
                    System.out.println("Number of users:  " + numberOfUsers);
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