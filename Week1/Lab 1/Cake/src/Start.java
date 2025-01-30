public class Start {
    public static void main(String[] args) {
        
        Cake[] cakesArray = new Cake[20];

        cakesArray[0] = new CustomCake("Vanilla", 10.00, 10.00, 15.00);
        cakesArray[1] = new CustomCake("Strawberry", 10.00, 10.00, 15.00);
        cakesArray[2] = new CustomCake("Lime", 10.00, 10.00, 15.00);
        cakesArray[3] = new CustomCake("Cheese", 10.00, 10.00, 15.00);
        cakesArray[4] = new CustomCake("Chocolate", 10.00, 10.00, 15.00);
        cakesArray[5] = new CustomCake("Pineapple", 10.00, 10.00, 15.00);
        cakesArray[6] = new CustomCake("Carrot", 10.00, 10.00, 15.00);
        cakesArray[7] = new CustomCake("Gum", 10.00, 10.00, 15.00);
        cakesArray[8] = new CustomCake("Raspberry", 10.00, 10.00, 15.00);
        cakesArray[9] = new CustomCake("Blueberry", 10.00, 10.00, 15.00);
        cakesArray[10] = new CustomCake("Berry", 10.00, 10.00, 15.00);
        cakesArray[11] = new CustomCake("Lemon", 10.00, 10.00, 15.00);
        cakesArray[12] = new ReadyCake("Purple", 20);
        cakesArray[13] = new ReadyCake("Mango", 20);
        cakesArray[14] = new ReadyCake("Poodle", 20);
        cakesArray[15] = new ReadyCake("Cat", 20);
        cakesArray[16] = new ReadyCake("Shark", 20);
        cakesArray[17] = new ReadyCake("Dog", 20);
        cakesArray[18] = new ReadyCake("Bird", 20);
        cakesArray[19] = new ReadyCake("Banana", 20);

        double total = 0;
        for (int i = 0; i < cakesArray.length; i++) {
            total += cakesArray[i].CalculatePrice();
        }

        System.out.println("Total= $" + total);
    }
}
