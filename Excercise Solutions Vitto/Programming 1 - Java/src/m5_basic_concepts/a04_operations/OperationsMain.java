package m5_basic_concepts.a04_operations;

import java.util.Scanner;

public class OperationsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value1, value2;
        System.out.print("Please enter the first integer: ");
        value1 = scanner.nextInt();
        System.out.print("Please enter the second integer: ");
        value2 = scanner.nextInt();

        Operations operations = new Operations(value1, value2);
        System.out.print(operations);
    }
}
