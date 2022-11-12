package m2_basic_concepts.m2_assignments.a02_numbersv1;

public class NumbersV1Part3and4 {
    public static void main(String[] args) {
        int first = 8;
        int second = 5;
        int result = 0;

        result = first++;
        System.out.println(result + " = " + first + "++");
        result = ++first;
        System.out.println(result + " = " + "++" +  first );

        result = second--;
        System.out.println(result + " = " + second + "--");
        result = --second;
        System.out.println(result + " = " + "--" + second);

        System.out.println("Sum: " + (first + second)+ "\n"
                            + "Difference: " + (first - second) + "\n"
                            + "Product: " + (first * second) + "\n"
                            + "Quotient: " + (first / second) + "\n"
                            + "Remainder: " + (first % second));
    }
}
