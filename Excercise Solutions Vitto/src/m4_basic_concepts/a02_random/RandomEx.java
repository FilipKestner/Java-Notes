package m4_basic_concepts.a02_random;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Random randomBoolean = new Random();
        Random randomDecimal = new Random();

        for(int i = 0; i < 6; i++){
            System.out.print(randomNumber.nextInt(1,7) + " ");
        }
        System.out.println();
        for(int i = 0; i < 5; i++){
            System.out.print(randomBoolean.nextBoolean() + " ");
        }
        System.out.println();
        for(int i = 0; i < 4; i++){
            System.out.print(randomDecimal.nextDouble() + " ");
        }
    }
}
