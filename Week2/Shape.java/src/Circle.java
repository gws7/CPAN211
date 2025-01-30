public class Circle extends Shape {
    double radius;

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius*radius*Math.PI;
    }
}
