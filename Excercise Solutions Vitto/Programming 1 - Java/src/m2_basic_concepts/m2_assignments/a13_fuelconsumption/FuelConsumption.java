package m2_basic_concepts.m2_assignments.a13_fuelconsumption;

import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        double previousMileage, currentMileage, mileageDifference;
        double litersRefilled;
        double consumption;

        System.out.println("Enter the previous mileage: ");
        previousMileage = keyboard.nextDouble();
        System.out.println("Enter the current mileage: ");
        currentMileage = keyboard.nextDouble();
        System.out.println("Enter the amount of liters refilled: ");
        litersRefilled = keyboard.nextDouble();

        mileageDifference = currentMileage - previousMileage;
        consumption = litersRefilled/ (mileageDifference/100);

        System.out.println("Consumption for " + mileageDifference + " driven: " + consumption + " liters/100km");



    }
}
