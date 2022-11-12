package m3_basic_concepts.a01_age;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int age;
        System.out.print("What is your age? ");
        age = keyboard.nextInt();

        if(age >= 0) {
            switch (age) {
                case 0, 1 -> System.out.println("Category: baby");
                case 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Category: Child");
                case 13, 14, 15, 16, 17 -> System.out.println("Category: Teenager");
                default -> System.out.println("Category: Adult");
            }
        }
        else{
            System.out.println("Invalid age");
        }
    }
}
