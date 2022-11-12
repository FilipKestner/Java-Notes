package m6_basic_concepts.a06_counting_letters;

import java.util.Scanner;

public class Counting_Letters {
    public static void main(String[] args) {
        // ASCII a = 97, z = 122;
        int [] letterCount = new int [26];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);

            if (letter >= 'a' && letter <= 'z') {
                letterCount[(int)letter - 'a']++;
            }
        }

        for (int i = 0; i < letterCount.length; i++) {
            System.out.printf("%c: %d\n", (char)(i+'a'), letterCount[i]);
        }
    }
}
