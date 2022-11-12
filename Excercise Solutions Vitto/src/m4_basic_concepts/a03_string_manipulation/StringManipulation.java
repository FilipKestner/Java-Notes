package m4_basic_concepts.a03_string_manipulation;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String sentence;
        System.out.print("Please enter a sentence: ");
        sentence = keyboard.nextLine();

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.replaceAll("a", "o"));
        System.out.println(sentence.length());
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length() - 1));

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char chosenChar = 'e';
            if (sentence.charAt(i) == chosenChar){
                count++;
            }
        }
        System.out.println(count);
    }
}
