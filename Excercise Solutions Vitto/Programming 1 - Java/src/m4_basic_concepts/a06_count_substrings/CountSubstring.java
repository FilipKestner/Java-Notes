package m4_basic_concepts.a06_count_substrings;

public class CountSubstring {
    public static void main(String[] args) {
        String sentence = "The more you learn, the less you know.";
        String sentenceSub = "ou";
        int count = 0;
        int index = 0;

        while((index = sentence.indexOf(sentenceSub, index)) != -1) {
            count++;
            index++;
        }
        System.out.println("Substring \"" + sentenceSub + "\" appears " + count + " time(s)");
    }
}
