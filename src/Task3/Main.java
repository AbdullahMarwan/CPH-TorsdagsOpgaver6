package Task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Customer customer1 = new Customer("DummyFirst1", "DummyLast1", "Dummy1");
        Customer customer2 = new Customer("DummyFirst2", "DummyLast2", "Dummy2");
        Customer customer3 = new Customer("DummyFirst3", "DummyLast3", "Dummy3");
        Customer customer4 = new Customer("DummyFirst4", "DummyLast4", "Dummy4");
        Customer customer5 = new Customer("DummyFirst5", "DummyLast5", "Dummy5");
        Customer customer6 = new Customer("DummyFirst6", "DummyLast6", "Dummy6");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCostumers();
    }

    //TODO 3.D print all costumers
    public static void printCostumers(){
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

}
