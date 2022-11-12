package m6_basic_concepts.a05_temperatures;

import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMBER_OF_TEMPERATURES = 7;

        double[] temperatures = new double[NUMBER_OF_TEMPERATURES];

        System.out.printf("Please enter %d temperatures \n", NUMBER_OF_TEMPERATURES);
        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("Day %d: ", i+1);
            temperatures[i] = scanner.nextFloat();
        }

        float average = 0.0f;
        for ( double temperature : temperatures ) {
            average += temperature;
        }
        average = average/(temperatures.length);

        int counter = 1;
        System.out.println("SUMMARY \n=================");
        for (double temperature : temperatures) {
            System.out.printf("Day %d:%6s %.2f\n", counter, " ", temperature);
            counter++;
        }
        System.out.println("=================");
        System.out.printf("Average: %.2f", average);

    }
}
