package m3_basic_concepts.a04_multiples;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        final int MAX = 100;
        int number;
        int numberCurrent;
        int multiplier = 1;

        System.out.print("Which number would you like to see the multiples of? ");
        number = keyboard.nextInt();
        numberCurrent = number;

        while (numberCurrent < MAX) {
            numberCurrent = number * multiplier;
            System.out.println(numberCurrent);
            multiplier++;
        }


    }
}
