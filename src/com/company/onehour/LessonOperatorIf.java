package com.company.onehour;

import java.util.Scanner;

public class LessonOperatorIf {

    public static void learn() {

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
/*
        int i = 500, j = 1000;
        if (i != 400 && j == 100) {
            System.out.println("continue");
        } else if (i < 600 && j <1001) {
            System.out.println("more");
        } else if (i > 400 && j >1000){
            System.out.println("less");
        } else {
            System.out.println("null");
        }
*/
        switch (num){
            case 10:
                System.out.println("num = 10");
                break;
            case 50:
                System.out.println("num = 50");
                break;
            case 100:
                System.out.println("num = 100");
                if (num == 100)
                    System.out.println("All right!");
                    break;
            default:
                System.out.println("I don't know this num");
        }

    }
}
