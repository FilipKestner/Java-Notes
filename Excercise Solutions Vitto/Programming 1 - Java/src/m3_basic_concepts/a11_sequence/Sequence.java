package m3_basic_concepts.a11_sequence;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int amount;
        int startingValue;
        int incrementValue;

        System.out.print("How many numbers do you want to print? ");
        amount = keyboard.nextInt();
        System.out.print("What is the starting value? ");
        startingValue = keyboard.nextInt();
        System.out.print("What is the increment value? ");
        incrementValue = keyboard.nextInt();

        for(int i = 0; i < amount; i++) {
            System.out.print(startingValue + " ");
            startingValue += incrementValue;
        }
    }
}
