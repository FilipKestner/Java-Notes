package m4_basic_concepts.a04_alphabetical_order;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sentence1;
        String sentence2;

        System.out.print("Enter a text: ");
        sentence1 = keyboard.nextLine();
        String result1 = sentence1.trim();
        System.out.print("Enter another text: ");
        sentence2 = keyboard.nextLine();
        String result2 = sentence2.trim();


        if (result1.compareTo(result2) < 0){
            System.out.print(sentence1 + " " + sentence2);
        }
        else if (result1.compareTo(result2) > 0){
            System.out.print(sentence2 + " " + sentence1);
        }

    }
}
