// MOHD ALI SIDDIQUI
// 25BAI10030

import java.util.Scanner;

/**
 * Advanced Calculator
 * Supports basic arithmetic, power, roots, trigonometry, logarithms,
 * factorial, and memory functions.
 */
public class AdvanceCalculator {

    // Memory storage
    private static double memory = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("===================================");
        System.out.println(" ADVANCED CALCULATOR (Java)");
        System.out.println("===================================");

        while (running) {
            printMenu();
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1": 		// Add
                    twoNumberOp(sc, '+');
                    break;
                case "2": 		// Subtract
                    twoNumberOp(sc, '-');
                    break;
                case "3": 		// Multiply
                    twoNumberOp(sc, '*');
                    break;
                case "4":		// Divide
                    twoNumberOp(sc, '/');
                    break;
                case "5": 		// Modulus
                    twoNumberOp(sc, '%');
                    break;
                case "6": 		// Power
                    twoNumberOp(sc, '^');
                    break;
                case "7": 		// Square root
                    oneNumberOp(sc, "sqrt");
                    break;
                case "8": 		// Factorial
                    oneNumberOp(sc, "fact");
                    break;
                case "9": 		// Sin
                    oneNumberOp(sc, "sin");
                    break;
                case "10": 		// Cos
                    oneNumberOp(sc, "cos");
                    break;
                case "11": 		// Tan
                    oneNumberOp(sc, "tan");
                    break;
                case "12": 		// Natural Log
                    oneNumberOp(sc, "ln");
                    break;
                case "13": 		// Log base 10
                    oneNumberOp(sc, "log10");
                    break;
                case "14": 		// Store to memory
                    System.out.print("Enter value to store in memory: ");
                    memory = readDouble(sc);
                    System.out.println("Stored " + memory + " in memory.");
                    break;
                case "15": 		// Recall memory
                    System.out.println("Memory value: " + memory);
                    break;
                case "16": 		// Clear memory
                    memory = 0;
                    System.out.println("Memory cleared.");
                    break;
                case "0": 		// Exit
                    running = false;
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }

        sc.close();
    }

    private static void printMenu() {
        System.out.println("-----------------------------------");
        System.out.println("1.  Addition (+)");
        System.out.println("2.  Subtraction (-)");
        System.out.println("3.  Multiplication (*)");
        System.out.println("4.  Division (/)");
        System.out.println("5.  Modulus (%)");
        System.out.println("6.  Power (^)");
        System.out.println("7.  Square Root");
        System.out.println("8.  Factorial");
        System.out.println("9.  Sine (degrees)");
        System.out.println("10. Cosine (degrees)");
        System.out.println("11. Tangent (degrees)");
        System.out.println("12. Natural Log (ln)");
        System.out.println("13. Log base 10");
        System.out.println("14. Store value in Memory");
        System.out.println("15. Recall Memory");
        System.out.println("16. Clear Memory");
        System.out.println("0.  Exit");
        System.out.println("-----------------------------------");
    }

    private static void twoNumberOp(Scanner sc, char op) {
        System.out.print("Enter first number: ");
        double a = readDouble(sc);
        System.out.print("Enter second number: ");
        double b = readDouble(sc);
        double result;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = a / b;
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Error: Modulus by zero is not allowed.");
                    return;
                }
                result = a % b;
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            default:
                System.out.println("Unknown operation.");
                return;
        }

        System.out.println("Result: " + result);
    }

    private static void oneNumberOp(Scanner sc, String op) {
        System.out.print("Enter number: ");
        double a = readDouble(sc);
        double result;

        switch (op) {
            case "sqrt":
                if (a < 0) {
                    System.out.println("Error: Cannot take square root of a negative number.");
                    return;
                }
                result = Math.sqrt(a);
                break;
            case "fact":
                if (a < 0 || a != Math.floor(a)) {
                    System.out.println("Error: Factorial requires a non-negative integer.");
                    return;
                }
                result = factorial((long) a);
                break;
            case "sin":
                result = Math.sin(Math.toRadians(a));
                break;
            case "cos":
                result = Math.cos(Math.toRadians(a));
                break;
            case "tan":
                result = Math.tan(Math.toRadians(a));
                break;
            case "ln":
                if (a <= 0) {
                    System.out.println("Error: ln requires a positive number.");
                    return;
                }
                result = Math.log(a);
                break;
            case "log10":
                if (a <= 0) {
                    System.out.println("Error: log10 requires a positive number.");
                    return;
                }
                result = Math.log10(a);
                break;
            default:
                System.out.println("Unknown operation.");
                return;
        }

        System.out.println("Result: " + result);
    }

    private static double factorial(long n) {
        double result = 1;
        for (long i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static double readDouble(Scanner sc) {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid number, please enter again: ");
            }
        }
    }
}