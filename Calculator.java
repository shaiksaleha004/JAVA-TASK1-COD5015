SIMPLE JAVA CALCULATOR ......
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            double result = 0;

            switch (choice) {
                case 1:
                    result = add(scanner);
                    break;
                case 2:
                    result = subtract(scanner);
                    break;
                case 3:
                    result = multiply(scanner);
                    break;
                case 4:
                    result = divide(scanner);
                    break;
                case 5:
                    result = exponentiation(scanner);
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            if (!quit) {
                System.out.println("Result: " + result);
                System.out.println();
            }
        }
        scanner.close();
    }

    public static double add(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        return a + b;
    }

    public static double subtract(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        return a - b;
    }

    public static double multiply(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        return a * b;
    }

    public static double divide(Scanner scanner) {
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();
        if (denominator == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // NaN represents "Not a Number"
        } else {
            return numerator / denominator;
        }
    }

    public static double exponentiation(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }
}
