package com.dennis.api;

import com.dennis.api.enums.NavigationOfConsumer;
import com.dennis.api.enums.NavigationOfFunction;
import com.dennis.api.enums.NavigationOfPredicate;
import com.dennis.api.enums.NavigationOfSupplier;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Scanner input = new Scanner(System.in);
        // while (NavigationOfPredicate.select(input)) ;
        while(NavigationOfFunction.select(input).equals("x"));
        //while(NavigationOfSuplier.select(input).equals("x"));
    }
}