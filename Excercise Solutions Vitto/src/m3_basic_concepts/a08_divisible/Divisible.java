package m3_basic_concepts.a08_divisible;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int firstNumber, secondNumber;
        int productNumber;
        final int maximumValue = 1000;
        int f = 0;


        System.out.print("Enter the first divider: ");
        firstNumber = keyboard.nextInt();
        System.out.print("Enter the second divider: ");
        secondNumber = keyboard.nextInt();

        productNumber = firstNumber * secondNumber;

        for(int i = 1; i < maximumValue; i++) {
            if (i % productNumber == 0) {
                System.out.print(i + " ");
                f++;
                if(f == 10){
                    System.out.println();
                    f = 0;
                }
            }
        }

    }
}
