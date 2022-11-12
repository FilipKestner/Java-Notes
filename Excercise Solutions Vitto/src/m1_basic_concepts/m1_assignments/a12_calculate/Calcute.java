package m1_basic_concepts.m1_assignments.a12_calculate;

import java.util.Scanner;

public class Calcute {
    public static void main(String[] args) {
        double a;
        double b;
        double result;
        int choice;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        a = keyboard.nextDouble();
        System.out.print("Enter b number: ");
        b = keyboard.nextDouble();

        System.out.print("Choose operation: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Exponentiation \n");
        choice = keyboard.nextInt();

        if (choice == 1) {
            result = a + b;
            System.out.println("Your choice: " + choice);
            System.out.println(a + " + " + b + " = " + result);
        }
        if (choice == 2) {
            result = a - b;
            System.out.println("Your choice: " + choice);
            System.out.println(a + " - " + b + " = " + result);
        }
        if (choice == 3) {
            result = a * b;
            System.out.println("Your choice: " + choice);
            System.out.println(a + " * " + b + " = " + result);
        }
        if (choice == 4) {
            result = a / b;
            System.out.println("Your choice: " + choice);
            System.out.println(a + " / " + b + " = " + result);
        }
        if (choice == 5) {
            result = Math.pow(a, b);
            System.out.println("Your choice: " + choice);
            System.out.println(a + "^" + b + " = " + result);
        }

    }
}