package m5_basic_concepts.a05_maximum;

public class MaximumMain {
    public static void main(String[] args) {

        Maximum maximum = new Maximum(1, 3, 2);
        System.out.println("maximum = " + maximum.max());

        maximum = new Maximum(1L, 2, 3);
        System.out.println("maximum = " + maximum.max());

        maximum = new Maximum(3L, 2.0, 1);
        System.out.println("maximum = " + maximum.max());

        maximum = new Maximum();
        System.out.println("maximum = " + maximum.max(1, 3, 2));

        maximum = new Maximum();
        System.out.println("maximum = " + maximum.max(1, 3, 2L));

        maximum = new Maximum();
        System.out.println("maximum = " + maximum.max(1.0, 3, 2));

    }
}
