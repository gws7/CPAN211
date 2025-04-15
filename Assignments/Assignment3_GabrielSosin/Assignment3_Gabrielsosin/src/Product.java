// Author: Gabriel Sosin
public class Product {
    String name;
    double price;
    int totalPurchased;
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.totalPurchased = 0;
    }
    
    public void addPurchase(int quantity){
        this.totalPurchased += quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", totalPurchased=" + totalPurchased + '}';
    }
    
}
