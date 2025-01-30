package interface_example;

public class Circle implements Interface_Example{
    double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void display() {
        System.out.println("Hello");
    }
}
