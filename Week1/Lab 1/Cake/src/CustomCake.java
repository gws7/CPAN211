public class CustomCake extends Cake{
    private double weight;
    private double fee;

    public double getFee() {
        return fee;
    }
    public void setFee(float fee) {
        this.fee = fee;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    CustomCake(String name, double price, double weight, double fee){
        super(name, price);
        this.fee = fee;
        this.weight = weight;
    }

    @Override
    public double CalculatePrice() {
        return getPrice() * weight + fee;
    }

    @Override
    public String toString() {
        return "CustomCake: " + name + "Price: " + price + "Fee: " + fee + "Weight:" + weight; 
    }
}
