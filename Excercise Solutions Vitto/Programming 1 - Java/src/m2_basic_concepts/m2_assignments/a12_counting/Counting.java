package m2_basic_concepts.m2_assignments.a12_counting;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        final int MAX = 10;
        int a = 1;
        int b = 10;

        while (a <= MAX ){
            System.out.println((a++) + " - " + (b--));
        }
    }
}
