package interface_example;

abstract public class Shape implements Interface_Example{
    private String color;
    public Shape(){};
    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
