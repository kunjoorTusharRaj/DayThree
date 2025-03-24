import java.util.Scanner;

public class calcluator {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("=========================");
            System.out.println("      CALCULATOR MENU    ");
            System.out.println("=========================");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exponentiation (^)");
            System.out.println("7. Floor Division (//)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int op = s.nextInt();
            System.out.println("enter the number 1");
            int num1 = s.nextInt();
            System.out.println("enter the number 2");
            int num2 = s.nextInt();
            switch (op) {
                case 1 -> System.out.println("Result: " + (num1 + num2));
                case 2 -> System.out.println("Result: " + (num1 - num2));
                case 3 -> System.out.println("Result: " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0)
                        System.out.println("Result: " + (num1 / num2));
                    else
                        System.out.println("Error: Division by zero!");
                }
                case 5 -> System.out.println("Result: " + (num1 % num2));
                case 6 -> System.out.println("Result: " + Math.pow(num1, num2));
                case 7 -> System.out.println("Result: " + Math.floor(num1 / num2));
            }
        }
    }
}