/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Serialization {

     public static void main(String[] args) {
        // Create a list of Product objects
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 999.99));
        productList.add(new Product("Smartphone", 599.99));
        productList.add(new Product("Tablet", 299.99));

        // Serialize the list of Product objects to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("products.ser"))) {
            out.writeObject(productList);
            System.out.println("Product list has been serialized to products.ser");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Deserialize the list of Product objects from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("products.ser"))) {
            List<Product> deserializedProductList = (List<Product>) in.readObject();
            System.out.println("Deserialized Product List:");
            for (Product product : deserializedProductList) {
                System.out.println(product);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
    
}
