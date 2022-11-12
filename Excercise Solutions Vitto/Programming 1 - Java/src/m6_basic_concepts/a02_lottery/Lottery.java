package m6_basic_concepts.a02_lottery;

public class Lottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = {3, 6, 17, 31, 32, 43};

        for ( int i = 0; i < lotteryNumbers.length; i++) {
            System.out.printf("%d ", lotteryNumbers[i]);
        }

        System.out.println();
        lotteryNumbers[1] = 13;

        for ( int i = 0; i < lotteryNumbers.length; i++) {
            System.out.printf("%d ", lotteryNumbers[i]);
        }
    }
}
