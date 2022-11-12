package m3_basic_concepts.a10_asciibox;

import java.util.Scanner;

public class Ex0310 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char character = keyboard.next().charAt(0);
        System.out.println("Please enter the width (2..60): ");
        int width = keyboard.nextInt();
        System.out.println("Please enter the height (2..20:");
        int height = keyboard.nextInt();
        for (int i = 1; i <= width; i++) {
            System.out.print(character);
        }
        for (int i = 0; i <= (height - 2); i++) {
            System.out.print(character);
            for (int l = 0; l < width - 2; l++) {
                System.out.print(" ");
            }
            System.out.print(character + "\n");
        }
        for (int i = 0; i < width; i++) {
            System.out.print(character);
        }
    }
}
