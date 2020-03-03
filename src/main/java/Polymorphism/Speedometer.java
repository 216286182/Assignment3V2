package Polymorphism;

public class Speedometer extends Car{

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving 60km/h");
    }
}
