package com.company;

public class TestOperatorIf {

    public static void test() {

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

        int num = 100;
        switch (num){
            case 10:
                System.out.println("num = 10");
                break;
            case 50:
                System.out.println("num = 50");
                break;
            case 1000:
                System.out.println("num = 1000");
                if (num == 100)
                    System.out.println("All right!");
                    break;
            default:
                System.out.println("num is null");
        }

    }
}
