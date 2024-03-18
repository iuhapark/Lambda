package com.dennis.api.post;

import com.dennis.api.enums.PostRouter;

import java.util.Scanner;

public class PostView {
    public static void main(Scanner sc) {
        PostRouter.execute(sc);

        PostController ctrl = new PostController();
            while (true) {
                System.out.println("x.Exit\n l.List");
                switch (sc.next()) {
                    case "x":
                        System.out.println("Exit");
                        return;
                    case "l":
                        System.out.println("1-List");
                        ctrl.findAll().forEach(i-> System.out.println(i));
                        break;
                }
            }
        }
    }