package m3_basic_concepts.a02_scrabble;

import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String letter;

        System.out.print("Write one letter to check its scrabble value: ");
        letter = keyboard.nextLine();

        switch (letter.toUpperCase()) {
            case "A", "E", "I", "O", "U", "L", "N", "S", "T", "R" -> System.out.println(letter + " = " + "1");
            case "D", "G" -> System.out.println(letter + " = " + "2");
            case "B", "C", "M", "P" -> System.out.println(letter + " = " + "3");
            case "F", "H", "V", "W", "Y" -> System.out.println(letter + " = " + "4");
            case "K" -> System.out.println(letter + " = " + "5");
            case "J", "X" -> System.out.println(letter + " = " + "8");
            case "Q", "Z" -> System.out.println(letter + " = " + "10");
            default -> System.out.println("Invalid Input!");
        }

    }
}
