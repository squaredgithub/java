package hello;

public class Main {
    public static void main(String[] args) {
        Phone itel = new Phone("Itel P33", 5,8, 8);
        System.out.println(itel.getName());




         itel.playMusic("hey there");
         itel.playMusic("wow wow");


         Phone pixel = new Phone("Pixel 3",16);
        System.out.println(pixel.getName());
    }
}
