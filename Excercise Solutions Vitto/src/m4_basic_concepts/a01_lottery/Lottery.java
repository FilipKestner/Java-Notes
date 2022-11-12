package m4_basic_concepts.a01_lottery;

import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        //not seeded so the numbers are constantly different
        for(int i = 0; i < 7; i++) {
            System.out.println(random.nextInt(1, 46));
        }

        Random random2 = new Random(46);
        // it has a seed, so it's the same random numbers
        for(int i = 0; i < 7; i++) {
            System.out.println(random2.nextInt(46));
        }
    }
}
