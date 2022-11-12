package vowels;

import java.util.Scanner;


// ## Question 1
// Write a program that
// 1. ask the user for a sentence.
// 2. counts the number of vowels (aeiouy) in the sentence
// 3. prints the result to the screen

// You must use the switch statement in your program.

// ### Example
// ```
// Please enter a sentence: Goodbye and thanks for all the fish!
// The sentence contains 9 vowels
// ```

public class Vowels {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        int vowels = 0;

        // TODO
        // ------------------------------------------------------

        String sentence = kbd.nextLine();

        for(int i = 0; i < sentence.length(); i++){
            switch(sentence.charAt(i)){
                case 'a': vowels++; break;
                case 'e': vowels++; break;
                case 'i': vowels++; break;
                case 'o': vowels++; break;
                case 'u': vowels++; break;
                case 'y': vowels++; break;
            }


        }

        // ------------------------------------------------------
        System.out.printf("The sentence contains %d vowels.", vowels);
    }
}
