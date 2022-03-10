package Task1;


//TODO 1.a Driver Class
public class Driver {
    private String name;
    private int age;

    //TODO 1.b
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //TODO 1.g
    @Override
    public String toString() {
        return "Is driven by: " + name;
    }
}
