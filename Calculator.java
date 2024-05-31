import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Console Calculator!");
        System.out.println("Enter 'exit' to quit.");

        while (true) {
            System.out.print("Enter first number: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            double num1 = Double.parseDouble(input);

            System.out.print("Enter operation (+, -, *, /): ");
            char operation = scanner.nextLine().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation!");
                    continue;
            }

            System.out.println("Result: " + result);
            scanner.nextLine();
        }

        scanner.close();
    }
}
