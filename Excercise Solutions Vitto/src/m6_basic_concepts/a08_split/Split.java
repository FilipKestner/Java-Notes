package m6_basic_concepts.a08_split;

public class Split {
    public static void main(String[] args) {
        String text = "Java can be tricky at times";

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.printf("\"%s\" ", words[i]);
        }
    }
}
