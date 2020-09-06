package com.company;

import java.util.Scanner;

public class LessonMath {

    public static void learn() {
        Scanner num = new Scanner(System.in);
        float first, second, result;
        System.out.println("Enter first num: ");
        first = num.nextFloat();
        System.out.println("Enter second num: ");
        second = num.nextFloat();
        result = first + second;
        System.out.println("Result is: " + result);
//
//        float num1 = 12.3f, num2= 232.3f, res;
//        res = num1 + num2;
//
//        System.out.println(res);
//
//        res ++;
//        System.out.println(res);
//
//        res += 45;
//        System.out.println(res);
    }
}
