package com.company;

import oop.Bird;
import oop.Dog;

public class Main {

    public static void main(String[] args) {
	  Bird phoeix = new Bird("ia", "gold",2,true,2);
        System.out.println(phoeix.getName());
        phoeix.eat("meat");

       System.out.println(phoeix.getWings() );
        phoeix.fly(4);
    }
}
