package Task3;

//TODO 3.A Customer Class + Fields
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    //TODO 3.B Constructor
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    //TODO 3.B ToString
    @Override
    public String toString() {
        return "FirstName= " + firstName + ", lastName= " + lastName + ", username= " + username + ", id= " + id;
    }

    //TODO 3.B Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
}
