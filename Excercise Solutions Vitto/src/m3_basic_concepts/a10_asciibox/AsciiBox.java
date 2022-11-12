package m3_basic_concepts.a10_asciibox;

import java.util.Scanner;

public class AsciiBox {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String character;
        int width, height;
        boolean working = true;


        System.out.println("We'll draw an ASCII box using a character and dimensions of your choice.");
        while(working){
            System.out.print("Enter a character: ");
            character = keyboard.nextLine();
            if (character.length() != 1){
                System.out.println("Please only put one character.");
                continue;
            }
            System.out.print("Enter the width (2..60): ");
            width = keyboard.nextInt();
            if (width < 2 || width > 60){
                System.out.println("Please enter a valid width");
                continue;
            }
            System.out.print("Enter the height (2..20): ");
            height = keyboard.nextInt();
            if (height < 2 || height > 20){
                System.out.println("Please enter a valid height");
                continue;
            }
            for (int i = 0; i <height; i++){
                for (int i2 = 0; i2 < width; i2++){
                    System.out.print(character);
                }
                System.out.println();
            }
            working = false;

        }

    }
}
