import java.util.ArrayList;
import java.util.Scanner;

public class Start{
    public static void main(String[] args) {
        ArrayList<Shape> array_of_shapes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shapes you want to order (Example order: 'Circle 0.5 Red'). Type 'End' to finish.");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            } 

            String[] words = input.split(" "); //Splits the user string by the spaces
            String type = words[0]; //Gets the first word
            double size = Double.parseDouble(words[1]); //Gets the second word and transforms it into a double 
            String color = words[2]; // Gets the last word

            if (type.equalsIgnoreCase("circle")) {
                array_of_shapes.add(new Circle(size, color));
            } else if (type.equalsIgnoreCase("square")) {
                array_of_shapes.add(new Square(size, color));
            }
        }   

        sc.close();

        double redTotalArea = 0; 
        double greenTotalArea = 0;
        double blueTotalArea = 0;

        for (Shape shape : array_of_shapes) {
            switch (shape.getColor().toLowerCase()) {
                case "red":
                    redTotalArea += shape.getArea();
                    break;
                case "green":
                    greenTotalArea += shape.getArea();
                    break;
                case "blue":
                    blueTotalArea += shape.getArea();
                    break;
            }
        }

        System.out.printf("Total area of red: %.2f\n", redTotalArea);
        System.out.printf("Total area of green: %.2f\n", greenTotalArea);
        System.out.printf("Total area of blue: %.2f\n", blueTotalArea);
    }
}