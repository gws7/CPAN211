public abstract class Cake {
    String name;
    double price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double CalculatePrice();

    Cake(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake: " + name + "Price: " + price; 
    }
}
