package m1_basic_concepts.m1_assignments.a06_age;

import java.time.LocalDate;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        String firstName;
        int birthyear;
        int year;

        year = LocalDate.now().getYear();

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("What is your name? ");
        firstName = keyboard.nextLine();
        System.out.print("What year were you born? ");
        birthyear = keyboard.nextInt();

        System.out.print("If all goes well you will be " + (year - birthyear) + " by the end of the year.");
    }


}
