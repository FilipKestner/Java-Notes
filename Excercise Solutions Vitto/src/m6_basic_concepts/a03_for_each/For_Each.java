package m6_basic_concepts.a03_for_each;

public class For_Each {
    public static void main(String[] args) {
        int[] lotteryNumbers = {3, 6, 17, 31, 32, 43};

        for ( int lotteryNumber : lotteryNumbers ) {
            System.out.printf("%d ", lotteryNumber);
        }

        System.out.println();
        lotteryNumbers[1] = 13;

        for ( int lotteryNumber : lotteryNumbers ) {
            System.out.printf("%d ", lotteryNumber);
        }


        int[] listedNumbers = new int[20];
        for (int i = 0; i < listedNumbers.length; i++) {
            listedNumbers[i] = 7 * (i+1);
        }
        System.out.println();
        for (int listedNumber : listedNumbers ) {
            System.out.printf("%d ", listedNumber);
        }
        System.out.println();
        for (int i=(listedNumbers.length-1); i>=0; i--) {
            System.out.printf("%d ", listedNumbers[i]);
        }
    }
}
