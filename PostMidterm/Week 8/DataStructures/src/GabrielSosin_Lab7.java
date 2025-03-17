import java.util.Scanner;
import java.util.Stack;

public class GabrielSosin_Lab7 {
    public static void main(String[] args) {
        //Open the scanner up so it can take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the postfix expression (e.g., 1 2 + 3 *): ");
        String expression = scanner.nextLine();
        //Close the scanner to save resources
        scanner.close();

        //Call the function to evaluate the postfix by passing the user entered string
        System.out.println("Result: " + evaluatePostfix(expression));
    }

    //Evaluates the expression the user entered
    public static int evaluatePostfix(String expression) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        String[] tokens = expression.split(" "); //Splits the inputted string into each character

        //Iterates through the array of characters that the user entered
        for (String token : tokens) {
            //If its an operator, it will add it to the operator stack
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                //Push the operator into the stack for operators
                operatorStack.push(token.charAt(0));

                //Get the two numbers from the stack for calculation
                int second = numberStack.pop();
                int first = numberStack.pop();

                //Get the operator from the operator stack and use it on the calculation method
                char operator = operatorStack.pop();
                int result = calculate(first, second, operator);

                //After getting the result I push it back into the stack in order to continue using it for more calculations
                numberStack.push(result);
            } else {
                //If it's a number, push it to the numberStack
                numberStack.push(Integer.parseInt(token));
            }
        }

        //After going through all the tokens, whats left is the result
        return numberStack.pop();
    }

    //Passing the popped first and second values, alongside the popped operator to calculate using a switch statement:
    public static int calculate(int first, int second, char operator) {
        switch (operator) {
            case '+': 
                return first + second;
            case '-': 
                return first - second;
            case '*': 
                return first * second;
            case '/': 
                return first / second;
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
