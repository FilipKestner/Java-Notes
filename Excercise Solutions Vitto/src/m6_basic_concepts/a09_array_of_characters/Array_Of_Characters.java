package m6_basic_concepts.a09_array_of_characters;

public class Array_Of_Characters {
    public static void main(String[] args) {
        String word = "JavaScript";

        char [] letters = word.toCharArray();

        for (char letter : letters) {
            System.out.printf("%c ", letter);
        }
    }
}
