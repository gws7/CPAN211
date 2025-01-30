public class Circle implements Shape{
    private String color;
    private double radius;

    @Override
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }    

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle radius: " + this.radius + "color: " + this.color;
    }
}
