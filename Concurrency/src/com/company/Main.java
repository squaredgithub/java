package com.company;

public class Main {

    public static void main(String[] args) {

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0; i<5; i++) {
//                    System.out.println("Printing " + i + "in a worker thread");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread.start();
//
//        for (int i=0; i<5; i++) {
//            System.out.println("Printing " + i + "in a Main thread");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        int a = 2;
        int c = 0;

       try{
           System.out.println(a/c);
       }catch (Exception r) {//NullPointerException,io,e.printlnStackTrace()
           System.out.println("C was zero");
       }

    }
}
