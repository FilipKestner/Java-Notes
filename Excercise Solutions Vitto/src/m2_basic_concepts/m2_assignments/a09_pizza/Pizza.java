package m2_basic_concepts.m2_assignments.a09_pizza;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int singlePizza = 800;
        int singleTopping = 50;
        int sum = 0;
        double finalPrice;

        int numberPizza;
        int numberTopping;

        System.out.println("How many pizzas would you like: ");
        numberPizza = keyboard.nextInt();

        sum = singlePizza * numberPizza;

        for (int i = 1; i <= numberPizza; i++) {
            System.out.print("How many extra toppings for pizza " + i + " : ");
            numberTopping = keyboard.nextInt();
            sum += singleTopping * numberTopping;

        }
        finalPrice = (double)sum * 0.01;

        System.out.print("Total price: €" + finalPrice );
    }
}
