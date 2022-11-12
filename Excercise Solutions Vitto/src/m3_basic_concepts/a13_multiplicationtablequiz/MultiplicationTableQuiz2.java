package m3_basic_concepts.a13_multiplicationtablequiz;

import java.util.Scanner;

public class MultiplicationTableQuiz2 {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int numberChosen;
        int result;
        int answer;
        int errorCounter = 0;

        System.out.print("Which multiplication table would you like to practice? ");
        numberChosen = keyboard.nextInt();

        for (int row = 1; row <= 10; row++){
            System.out.print(row + " * " + numberChosen + "= " );
            answer = keyboard.nextInt();
            result = row * numberChosen;
            if (result != answer){
                System.out.println("Wrong!");
                errorCounter++;
            }
            else{
                System.out.println("Correct!");
            }
        }
        System.out.print("You made " + errorCounter + " error(s)");

    }
}
