package m2_basic_concepts.m2_assignments.a03_taxes;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        float vat;
        float amount;
        int choice;
        float result;

        System.out.println("Enter the VAT percentage: ");
        vat = keyboard.nextFloat();

        System.out.println("Enter an amount in €: ");
        amount = keyboard.nextFloat();

        System.out.println("Make a choice (1 = inclusive, 2 = exclusive): ");
        choice = keyboard.nextInt();

        if (choice == 1) {
            result = amount/(1+(vat/100));
            System.out.println(result);
            return;
        }
        else if(choice == 2) {
            result = amount + (amount*(vat/100));
            System.out.println(result);
            return;
        }
        else{
            System.out.println("Invalid choice");
            return;
        }






    }
}
