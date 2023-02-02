package itfc;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("tesla");

        carInterface.start();
        carInterface.move(78);

        CarInterface fossilcarinterface = new FossilFuelCar("Mercedes");
        fossilcarinterface.start();
        fossilcarinterface.move(678);



    }
}
