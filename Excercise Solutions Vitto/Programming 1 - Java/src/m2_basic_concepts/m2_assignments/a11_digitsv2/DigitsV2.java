package m2_basic_concepts.m2_assignments.a11_digitsv2;

import java.util.Scanner;

public class DigitsV2 {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int submitNumber;
        String numbers;
        int convertedValue;
        int digits;
        int minimumNumber;
        int maximumNumber;
        int sum = 0;

        System.out.println("Enter how many digits you want: ");
        digits = keyboard.nextInt();
        minimumNumber = (int) Math.pow(10, (digits-1));
        maximumNumber = (int) Math.pow(10, digits);
        maximumNumber -= 1;
        System.out.println("Enter a " + digits + "-digit whole number (" + minimumNumber + "..." + maximumNumber + "): ");
        submitNumber = keyboard.nextInt();

        if (submitNumber >= minimumNumber && submitNumber <= maximumNumber) {
            numbers = Integer.toString(submitNumber);
            for (int i = 0; i < numbers.length(); i++) {
                convertedValue = ((Character.getNumericValue(numbers.charAt(i))));
                sum += convertedValue;
            }
            System.out.println("The sum of the digits of this number is " + sum);
        }
        else{
            System.out.println("Invalid Input");
        }



    }
}
