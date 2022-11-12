package m3_basic_concepts.a06_daysinmonth;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int month;

        System.out.print("Enter a month number (1 = January): ");
        month = keyboard.nextInt();

        switch (month) {
            //case 1, 3, 5, 7, 8, 10, 12 -> System.out.println( + "has 31 days.");
            //case 4, 6, 9, 11 -> System.out.println( + "has 30 days.");
            //case 2 -> System.out.println( + "has 28 days.");
            //default: System.out.println("Invalid month");
        }
    }
}
