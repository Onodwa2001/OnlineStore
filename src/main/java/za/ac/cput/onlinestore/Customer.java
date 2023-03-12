package za.ac.cput.onlinestore;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;

    public Customer() {}

    public Customer(String customerId, String firstName, String lastName, String email) {
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
