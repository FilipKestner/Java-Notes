package m3_basic_concepts.a05_factorial;

public class Factorial {
    public static void main(String[] args) {
        long number = 1;
        long fact = 1;

        for (long numberList = 1; numberList <= 20; numberList++) {
            for (long i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println(number + "! = " + fact);
            number ++;
            fact = 1;
        }
    }
}
