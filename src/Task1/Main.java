package Task1;

public class Main {

    public static void main(String[] args) {
        //TODO 1.h
        Driver driverGuy = new Driver("AbdulDriver", 21);

        //TODO 1.i
        Car myCar = new Car("Bugatti", "Bugatti2.0", 2240, "SLICK");

        //TODO 1.l New Car and assign same Driver
        Car myCar2 = new Car("Volvo", "Volvo3.0", 1940, "Old");
        myCar2.setDriver(driverGuy);

        //TODO 1.j
        myCar.setDriver(driverGuy);

        //TODO 1.k
        System.out.println(myCar);
        System.out.println(driverGuy);

        //TODO 1.m
        System.out.println(myCar2);
        System.out.println(driverGuy);
    }
}
