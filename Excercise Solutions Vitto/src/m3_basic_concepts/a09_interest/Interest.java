package m3_basic_concepts.a09_interest;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        double startingCapital;
        double twiceStartingCapital;
        double interestRate;
        int years;
        double compoundInterest;
        double endingCapital;
        long longEndingCapital;

        System.out.print("Enter the starting capital in €: ");
        startingCapital = keyboard.nextDouble();
        System.out.print("Enter the interest rate: ");
        interestRate = keyboard.nextDouble();
        interestRate *= 0.01;
        System.out.print("Enter the number of years: ");
        years = keyboard.nextInt();

        compoundInterest = startingCapital*((Math.pow(1+interestRate,(int)years)) - 1);
        endingCapital = startingCapital + compoundInterest;

        longEndingCapital = (long)endingCapital;
        System.out.print("The capital will amount to €" + longEndingCapital);



    }
}
