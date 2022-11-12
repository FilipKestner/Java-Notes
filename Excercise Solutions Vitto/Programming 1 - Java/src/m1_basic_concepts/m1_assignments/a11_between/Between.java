package m1_basic_concepts.m1_assignments.a11_between;

import java.util.Scanner;

public class Between {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("Enter first number (1... 100): ");
        a = keyboard.nextInt();
        System.out.print("Enter second number (1... 100): ");
        b = keyboard.nextInt();
        System.out.print("Enter third number (1... 100): ");
        c = keyboard.nextInt();

        if (( a < 1 || a > 100 ) || ( b < 1 || b > 100 ) || ( c < 1 || c > 100 )) {
            System.out.println("One of the numbers is not in the valid range");
        }

        if (( a > b && a < c ) || (a < b && a > c)) {
            System.out.print("The middle number: " + a);
            return;
        }
        if (( b > a && b < c ) || (b < a && b > c)) {
            System.out.print("The middle number: " + b);
            return;
        }
        //if (( c > a && c < b ) || (c < a && c > b )) {
        System.out.print("The middle number: " + c);
        //}


    }
}
