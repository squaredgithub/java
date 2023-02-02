package oop;

public class Bird extends  Animal {

    private  int wings;

    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        System.out.println("Chewing " + food);
        System.out.println("Eating finished");
    }

    public void fly () {
        System.out.println(this.getName() + " is flying");
    }
    public  void fly(int speed){
       // System.out.println(this.getName()  + this.fly(20));

    }


    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
