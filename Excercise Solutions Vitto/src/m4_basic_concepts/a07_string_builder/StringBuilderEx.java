package m4_basic_concepts.a07_string_builder;

import java.util.Scanner;

public class StringBuilderEx {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        StringBuilder builder3 = new StringBuilder();
        StringBuilder builder4 = new StringBuilder();

        System.out.println("Enter your first name and last name, separated by a space: ");
        StringBuilder name = new StringBuilder(keyboard.nextLine());

        for (int x = 0; x < name.length(); x++) {
            if (x == 0) {
                builder1.append(name.charAt(x));
            }
            if (name.charAt(x) == ' ') {
                builder1.append(name.charAt(x+1));
            }
        }
        System.out.println(builder1);

        for (int x = name.length() - 1 ; x >= 0; x--) {
            builder2.append(name.charAt(x));
        }
        System.out.println(builder2);
    }
}
