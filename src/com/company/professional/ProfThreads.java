package com.company.professional;

class SomeThread extends Thread {
    public void run (){
        for (int i = 0; i<10; i++)
            System.out.println("Number is :" + i);
    }
}

public class ProfThreads {
    public static void learn () {

        SomeThread test = new SomeThread();
        test.start();
        // .start - вызов потока
        SomeThread test1 = new SomeThread();
        test1.start();
    }
}
