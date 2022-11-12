package m3_basic_concepts.a12_multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int chosenNumber = 1;
        int result;

        while (chosenNumber >= 1 && chosenNumber <= 30){
            System.out.print("Enter a number between 1 and 30: ");
            chosenNumber = keyboard.nextInt();
            if (chosenNumber <1 || chosenNumber > 30){
                continue;
            }
            for (int row = 1; row <= chosenNumber; row++){
                for (int column = 1; column <= chosenNumber; column++){
                    result = row * column;
                    System.out.printf("|%3d", result);
                }
                System.out.println("|");
            }
            chosenNumber = 0;
        }
    }
}
