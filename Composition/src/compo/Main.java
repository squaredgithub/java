package compo;

public class Main {
    public static void main(String[] args) {

//        Car mercedes = new Car("Mercedes AMG",4,"black",new Engine("Renault", 8000));
//        System.out.println(mercedes.getName());
//        Engine engine = mercedes.getEngine();
//        System.out.println("Engine Model: " + mercedes.getEngine().getModel());


//        Car mercedes = null;
//        if (mercedes != null) {
//            mercedes.getName();
//        } else {
//            System.out.println("The car  was null");
//        }
//        final  int a = 5;
//        a = a+1;

        final Engine engine = new Engine("Renault", 8000);
        engine.setRpm(10000);
        System.out.println(engine.getRpm());



    }
}
