package testig;

public class Tcls {
    private int age;
    private String color;

    private class TestIclass {
        private String name;


        public TestIclass(String name) {
            this.name = name;
        }

        private  void printAge() {
            System.out.println("Age: " + age);
        }
    }
}
