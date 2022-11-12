package m2_basic_concepts.m2_assignments.a08_asciivalues;

import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int index = 0;
        int length;
        char value;


        String sentence;
        System.out.println("Enter a string of text: ");
        sentence = keyboard.nextLine();
        length = sentence.length();

        for(index = 0; index < sentence.length(); index++){
            value = sentence.charAt(index);
            System.out.println(sentence.charAt(index) + " has an ASCII value of " + (byte)value);

        }

    }
}
