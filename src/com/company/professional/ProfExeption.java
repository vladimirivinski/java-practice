package com.company.professional;

public class ProfExeption {
    public static void learn() {
//        try {
//            int x = 100/0;
//        } catch (ArithmeticException e) {
//            System.out.println("Error :" +  e);
//        }
        int arr [] = {2, 33, 1};
        try {
            System.out.println(arr[3]);
        } catch (Exception e){
            System.out.println("Error :" + e);
        } finally {
            System.out.println("Finaly is working!!!");
        }

    }
}
