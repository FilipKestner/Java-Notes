package m6_basic_concepts.a04_average;

public class Average {
    public static void main(String[] args) {
        double average = 0;
        int[] numbers = {
                12, 17, 14, 18, 13, 13, 14, 17, 17, 16,
                10, 18, 13, 18, 12, 12, 10, 17, 10, 15,
                10, 11, 16, 12, 16, 11, 8, 10, 16, 14,
                17, 7, 11, 10, 15, 10, 14, 8, 9, 14
        };

        for ( int number : numbers ) {
            average += number;
        }

        average = average/(numbers.length);

        System.out.printf("The average is : %f", average);
    }
}
