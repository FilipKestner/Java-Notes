package m1_basic_concepts.m1_assignments.a04_welcome;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        String firstName;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("What is your name? ");
        firstName = new Scanner(System.in).nextLine();

        System.out.print("Welcome " + firstName);
    }
}
