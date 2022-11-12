package m1_basic_concepts.m1_assignments.a07_bmiv1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        int weight;
        double height;
        double bmi;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Dear patient, this programme will calculate your BMI.");

        System.out.print("Enter your weight in kilograms: ");
        weight = keyboard.nextInt();

        System.out.print("Enter your height in meters: ");
        height = keyboard.nextDouble();

        bmi = weight / (Math.pow(height, 2));
        System.out.print("Your BMI is " + bmi);
    }
}
