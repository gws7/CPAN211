public class ReadyCake extends Cake {
    ReadyCake(String name, double price){
        super(name, price);
    }

    @Override
    public double CalculatePrice() {
        return getPrice();
    }
    
    @Override
    public String toString() {
        return "ReadyCake: " + name + "Price: " + price; 
    }
}
