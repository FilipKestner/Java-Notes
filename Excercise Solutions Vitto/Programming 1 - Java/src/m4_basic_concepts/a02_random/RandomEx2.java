package m4_basic_concepts.a02_random;

import java.util.Random;

public class RandomEx2 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Random randomDecimal = new Random();
        Random randomEven = new Random();
        Random randomMultiple = new Random();
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(randomNumber.nextInt(900, 1001) + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(randomDecimal.nextDouble() + randomDecimal.nextInt(5,11) + "");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int value = randomEven.nextInt(0,101);
            System.out.print(((value%2 == 0) ? value : value +1) + " ");
        }
        System.out.println();
        while(counter < 10) {
            int value2 = randomEven.nextInt(0, 101);
            if (value2 % 3 == 0 && value2 < 100){
                System.out.print(value2 + " ");
                counter++;
            }
        }
    }
}
