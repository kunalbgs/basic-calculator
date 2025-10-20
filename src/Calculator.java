import java.util.Scanner;

public class Calculator {
   // Addition method
    public static double add(double a, double b) {
        return a + b;
    }

    //  Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }

    //  Multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }

    //  Division method with zero check
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    //  Main method starts
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //  Scanner object
        boolean keepRunning = true; //  Loop control

        //  Loop for multiple calculations
        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            int choice = scanner.nextInt(); // User choice

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close(); // Close scanner
    }

}