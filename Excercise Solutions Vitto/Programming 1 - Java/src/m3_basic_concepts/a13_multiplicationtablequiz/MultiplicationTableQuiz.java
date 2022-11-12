package m3_basic_concepts.a13_multiplicationtablequiz;

import java.util.Scanner;

public class MultiplicationTableQuiz {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int numberChosen;

        System.out.print("Which multiplication table would you like to see? ");
        numberChosen = keyboard.nextInt();

        for (int row = 1; row <= 10; row++){
            System.out.println(row + " * " + numberChosen + "= " + (row*numberChosen));
        }

    }
}
