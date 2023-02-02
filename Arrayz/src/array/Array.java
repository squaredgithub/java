package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String[] names = {"meisam", "me", "we", "gret", "Kipruto"};
        int [] numbers = {23456, 12345, 12345,87654 ,3453};
        for (int i = 0; i<names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Please Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i =0; i<names.length; i++){
            if (name.equals(names[i])) {
                System.out.println(numbers[i]);
            }
        }
    }
}
