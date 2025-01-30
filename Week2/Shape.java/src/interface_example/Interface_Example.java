package interface_example;

public interface Interface_Example {
    default double getArea(){
        return 0.0;
    };

    abstract void display();

    void info(); //By default is abstract
}
