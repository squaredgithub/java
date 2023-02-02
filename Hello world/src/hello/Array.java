package hello;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        String[] studts = new String[5];
//        studts[1] = "dshhj";
//        studts[0] = "dshhj";
//        studts[4] = "dshhj";
//        studts[2] = "dshhj";
//        studts[3] = "dshhj";
//
//        System.out.println(studts[0]);
//
//        String [] employees = { "uidvsjkkds", "dkjvdskldc", "xmcmfdj"};
//        int[] ers = {1, 2, 3, 4, 5};
//
//        for (int i= 0; i<ers.length; i++ ) {
//            System.out.println(i);
//        }


        String[] names = {"Meisam", "Sarah", "Tom", "Josh","Willy"};
        int[] ers = {34522262,5672873,63287,67677287,67267872};
        for (int i=0; i<names.length; i++) {
            System.out.println( names[i]);
        }

        System.out.println("Please Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i=0; i<names.length; i++){
            if (name.equals(names[i])) {
                System.out.println(ers[i]);
            }
        }

    }
}
