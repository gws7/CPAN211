//Circle is concrete class
//Shape is abstract class that needs to be implemented

abstract public class Shape {
    private String color;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color){
        this.color = color;
    }

    // double getArea(){
    //     return 0.0;
    // }

    abstract double getArea();
}
