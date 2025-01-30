/*
Serialization is the process of converting an object into a sequence of bytes so that it can be:

Stored in a file, database, or other storage medium.
Transferred over a network to another system or process.
This allows objects to be saved and restored later, preserving their state.

Deserialization is the reverse process, where the sequence of bytes is converted back into a live object.

.
 */
package serialization;

import java.io.Serializable;

/**
 *
 * @author user
 */

// A simple class to demonstrate object serialization
class Product implements Serializable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}


