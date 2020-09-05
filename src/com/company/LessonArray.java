package com.company;

public class LessonArray {

    public static void learn() {
// создание двухмерного массива
        int [][] arr = new int[][] {
                {23,21,12,1},
                {10,13,43,3},
                {30,25,32,4}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("    ");
        }

//        arr [1][1] = 444; //переопределение значения
//        System.out.println(arr[2][3]);
//        System.out.println(arr[1][1]);
/*
        float [] arr = new float[] {20.12f, 30.31f, 40.11f, 2.31f, 232,3f}; //одномерный массив и его оперделение

        for (int i = 0; i<5; i++) {
            System.out.println("Element " + i + " is "+ arr[i]);
        }
*/
    }
}
