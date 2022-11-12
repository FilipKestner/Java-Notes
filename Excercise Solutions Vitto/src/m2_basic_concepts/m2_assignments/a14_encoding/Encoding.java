package m2_basic_concepts.m2_assignments.a14_encoding;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String sentence;

        System.out.println("Enter a sentence: ");
        sentence = keyboard.nextLine();
        sentence = sentence.toUpperCase();


    }
}
