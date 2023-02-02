package hello;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        System.out.print("myself");
//        System.out.println("myself");

//        JFrame frame = new JFrame();
//        frame.setSize(400,400);
//        frame.setVisible(true);

//variables
        // primitive data types
//     int s = 4;
//     System.out.println(s);
//
//     long l = 45;
//     System.out.println(l);
//
//
//     double d = 4.8;
//     System.out.println(d);
//
//     float f = (float) 2.9;
//     System.out.println(f);
//
//     char c = '\u00A9';
//        System.out.println(c);
//
//     //class data types
//        String g = "myself";
//        System.out.println(g);
//
//        boolean t = false;
//        System.out.println(t);

        //operators

       /* int c = 5;
        int k = 2;
        double q = (double) c * k;
        System.out.println(q);

        String t = "me ";
        String l = "self";
        String fl = t + l;
        System.out.println(fl);*/


       // for (int i = 0; i <7; i++) {
           // System.out.println("hey");

        int a = 3;
        int c = 9;
//relatio operator
//        boolean j = a>= c;<!
//        System.out.println(j);

        //boolean j = a==5 || c==9;&&,
       // System.out.println(j);

     //statements


//        boolean h =a>3;
//        if(!h){
//            System.out.println("greater");
//
//        }else {
//            System.out.println("less");
//
//        }

//        if (a>0){
//            System.out.println("Positive");
//
//        }else if (a<0){
//            System.out.println("Negative");
//        }else{
//            System.out.println("zero");
//        }
//        switch (a){
//            case 1:
//            System.out.println("One");
//            break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("! One,Two or Three");
//                break;
//        }


       // System.out.println("cout...");

        //LOOPS---for repetitive tasks
        int y = 5;
//     for(int i=0; i<y; i++ ) {
//            System.out.println("hello");
//         }
//        while (y<10){
//            y++;
//            if(y==8) {
//                continue;
//            }
//
//            System.out.println("Hey");
//
//        }
//        do {
//            System.out.println("wow");
//        }while (y<5);


//        System.out.println("enter number");
//
//        Scanner sc = new Scanner(System.in);
//        int as = sc.nextInt();
//        System.out.println("Answer was: " + as);
//        System.out.println("Enter your name: ");
//        String me = sc.next();
//        System.out.println("Hello " + me);


        Random rd = new Random();
        int er = rd.nextInt(30) +1;
        System.out.println("numeber: " + er);
    }

}
