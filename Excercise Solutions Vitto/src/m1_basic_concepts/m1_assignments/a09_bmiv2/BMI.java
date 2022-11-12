package m1_basic_concepts.m1_assignments.a09_bmiv2;

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

        if(bmi < 18){
            System.out.println("Your BMI is in the underweight category.");
            return;
        }
            if(bmi>18 && bmi<25){
                System.out.println("Your BMI is in the healthy weight category.");
                return;
            }
            if(bmi>=25 && bmi < 30) {
                System.out.println("Your BMI is in the overweight category.");
                return;
            }
            if(bmi>=30){
                System.out.println("Your BMI is in the obese category.");
                return;
            }

    }
}
