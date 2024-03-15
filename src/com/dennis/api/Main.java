package com.dennis.api;

import com.dennis.api.enums.Messenger;
import com.dennis.api.enums.Navigation;
import com.dennis.api.menu.MenuController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Scanner sc = new Scanner(System.in);


        Navigation.execute(sc);

        //Scanner input = new Scanner(System.in);
        // while (NavigationOfPredicate.select(input)) ;
       // while(NavigationOfFunction.select(input).equals("x"));
        //while(NavigationOfSuplier.select(input).equals("x"));
    }
}