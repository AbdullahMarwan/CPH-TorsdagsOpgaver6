package Task1;

//TODO 1.c Car Class and Constructor
public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private static Driver driver;

    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    //TODO 1.e getter
    public Driver getDriver() {
        return driver;
    }

    //TODO 1.e setter
    public void setDriver(Driver driver) {
        Car.driver = driver;
    }

    //TODO 1.f string override
    @Override
    public String toString() {
        return "Make: " + make + ". Model: " + model + " (" + year + "), BodyStyle: " + bodyStyle;
    }
}
