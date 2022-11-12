package m6_basic_concepts.a07_arrays_v2;

public class Arrays_V2 {
    public static void main(String[] args) {
        StringBuilder[] suits = new StringBuilder[4];

        suits[0] = new StringBuilder("hearts");
        suits[1] = new StringBuilder("clubs");
        suits[2] = new StringBuilder("diamonds");
        suits[3] = new StringBuilder("spades");

        for (StringBuilder suit : suits) {
            System.out.print(suit + " ");
        }
        StringBuilder[] suits2 = {new StringBuilder("hearts"), new StringBuilder("clubs"), new StringBuilder("diamonds"), new StringBuilder("spades")};


    }
}
