package m6_basic_concepts.a01_arrays_v1;

public class Arrays {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        float [] stockMarketRate = new float[20];
        boolean [] switches = new boolean[8];
        String [] words = new String[4];

        System.out.printf("first: %d  last: %d\n",numbers[0], numbers[numbers.length-1]);
        System.out.printf("first: %f  last: %f\n",stockMarketRate[0], stockMarketRate[stockMarketRate.length-1]);
        System.out.printf("first: %b  last: %b\n",switches[0], switches[switches.length-1]);
        System.out.printf("first: %s  last: %s\n",words[0], words[words.length-1]);
    }
}
