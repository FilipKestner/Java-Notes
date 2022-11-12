package m2_basic_concepts.m2_assignments.a07_asciisum;

import java.util.Scanner;

public class AsciiSum {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int sum = 0;
        int index = 0;
        int length;
        char value;

            String sentence;
        System.out.println("Enter a string of text: ");
        sentence = keyboard.nextLine();
        length = sentence.length();

        for(index = 0; index < sentence.length(); index++){
            value = sentence.charAt(index);
            sum += value;
        }
        System.out.println("sum = " + sum);

    }
}
