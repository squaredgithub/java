package test;

public class Main {
    public static void main(String[] args) {

        TestClass.name = "Meisam";

        TestClass testClass = new TestClass(26, "white");
        testClass.setName("meisam");
        System.out.println("Name: " + testClass.getName());

       TestClass.pls();

    }
}
