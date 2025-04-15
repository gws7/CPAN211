// Author: Gabriel Sosin
public class Customer {
    String firstName, lastName;
    double total;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.total = 0;
    }
    
    public void addToTotal(double amount){
        this.total += amount;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName + ", total=" + total + '}';
    }
    
}
