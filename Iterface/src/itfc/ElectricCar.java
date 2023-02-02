package itfc;

public class ElectricCar implements CarInterface {
    private String name;


    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this);
        System.out.println("Electricity flow started");


    }

    @Override
    public void move(int speed) {

        System.out.println(this.getName() + "is moving at" + speed + "mph");

    }
}
