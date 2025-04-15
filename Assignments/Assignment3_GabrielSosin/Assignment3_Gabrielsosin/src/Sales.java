// Author: Gabriel Sosin
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Sales {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String fileName = "C:/Programming/Semester 3/CPAN211 - Datastructures/Assignments/Assignment3_GabrielSosin/Assignment3_Gabrielsosin/Sales.txt";

        //Create map to hold customers and to hold products
        Map<Integer, Customer> customersMap = new HashMap<>();
        Map<Integer, Product> productsMap = new HashMap<>();

        //Reads file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            //While there are still lines to read, it will read them and process the data
            while ((line = br.readLine()) != null){
                processSale(line, customersMap, productsMap);
            }
            //After having read the file it prints out the maps
            printCustomers(customersMap);
            printProducts(productsMap);
        } catch (IOException e){
            System.out.println("Error Reading File " + e.getMessage());
        }
    }
    
    //Method that processes each line and adds it to maps
    private static void processSale(String line, Map<Integer, Customer> customers, Map<Integer, Product> products) {
        try {
            //Splits the lines on the spaces
            String[] parts = line.split(" ");
            //If any line is not split into 7 that means its not a valid entry
            if(parts.length != 7) throw new IllegalArgumentException("Wrong data form");
            
            //Get each line's elements by index and associate them with the proper variable
            int customerId = Integer.parseInt(parts[0]);
            String firstName = parts[1];
            String lastName = parts[2];
            int productId = Integer.parseInt(parts[3]);
            String productName = parts[4];
            double singleItemPrice = Double.parseDouble(parts[5]);
            int itemsPurchased = Integer.parseInt(parts[6]);
            
            //Using a map method, if a customer or product doesnt exist, we create a new place for them in the map
            customers.putIfAbsent(customerId, new Customer(firstName, lastName));
            customers.get(customerId).addToTotal(singleItemPrice * itemsPurchased); //Adds total to customer
            
            products.putIfAbsent(productId, new Product(productName, singleItemPrice));
            products.get(productId).addPurchase(itemsPurchased); //Tracks how many of x product was sold
        } catch (IllegalArgumentException e){
            System.out.println("Error at" + line + " " + e.getMessage());
        }
    }
    
    //Prints out the customers in a clean form
    private static void printCustomers(Map<Integer, Customer> customers){
        System.out.println("\n========== Customer Bills ==========");
        for(Customer customer : customers.values()){
            System.out.println(customer);
        }
        System.out.println("==================================\n");
    }
    
    //Prints out the products in a clean way
    private static void printProducts(Map<Integer, Product> products){
        System.out.println("========== Products Sales ==========");
        for(Product product : products.values()){
            System.out.println(product);
        }
        System.out.println("==================================\n");
    }
}
