package com.dennis.api.post;

import java.util.Scanner;

public class PostVIew {
    public static void main(Scanner sc) {
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