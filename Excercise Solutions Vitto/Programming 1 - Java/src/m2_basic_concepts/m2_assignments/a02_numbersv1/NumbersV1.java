package m2_basic_concepts.m2_assignments.a02_numbersv1;

import java.util.Scanner;

public class NumbersV1 {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        long firstBillion = 2000000000L;
        long secondBillion = 2000000000L;
        long sum;
        sum = firstBillion + secondBillion;
        System.out.println(sum);

        long firstTenThousand = 10000L;
        long secondTenThousand = 10000L;
        long result;
        result = firstTenThousand + secondTenThousand;
        System.out.println(result);
    }
}
