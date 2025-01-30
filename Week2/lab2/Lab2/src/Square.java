public class Square implements Shape {
    private String color;
    private double length;

    @Override
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }

    public Square(double length, String color){
        this.length = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square length: " + this.length + "color: " + this.color;
    }
}
