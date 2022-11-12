package m2_basic_concepts.m2_assignments.a01_variable;

import java.util.Scanner;

public class Variable{
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        boolean tired = true;
        char letter = 'v';
        byte v = 86;
        short trinity = 3;
        int age = 23;
        float b = 10.5f;
        double c = 20.333;
        final double PI = 3.14;
        // exercise says to change PI to PI = 3.1415926536;
        // that won't work because PI is final

        System.out.println("These are the values of your variables:\n"
                + "tired= " + tired + "\n"
                + "letter= " + letter + "\n"
                + "byte= " + v + "\n"
                + "short= " + trinity + "\n"
                + "age= " + age + "\n"
                + "b= " + b + "\n"
                + "c= " + c + "\n"
                + "PI= " + PI + "\n");

    }
}
