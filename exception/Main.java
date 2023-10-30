package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                System.out.print("Enter the first number: ");
                double firstNumber = scanner.nextDouble();


                System.out.print("Enter the second number: ");
                double secondNumber = scanner.nextDouble();


                if (secondNumber != 0) {

                    double result = firstNumber / secondNumber;


                    System.out.println("Result of division: " + result);


                    break;
                } else {
                    System.out.println("Error: Cannot divide by zero. Please try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid number input. Please try again.");


                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                break;
            }
        }


        scanner.close();
    }
}
