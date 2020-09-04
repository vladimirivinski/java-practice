package com.company;

import java.util.Scanner;

public class TestScanner {
    public static void test() {

        Scanner num =new Scanner(System.in);
//        int a;
//        a = num.nextInt();

        String text;
        text = num.nextLine();

//        System.out.println("My variable = " + a);
        System.out.println("My variable is " + text);
    }
}
