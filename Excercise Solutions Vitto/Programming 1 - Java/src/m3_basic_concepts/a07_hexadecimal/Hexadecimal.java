package m3_basic_concepts.a07_hexadecimal;

public class Hexadecimal {
    public static void main(String[] args) {
        char a = 0;
        String result;

        while (a <= 15){
            result = Integer.toHexString(a).toUpperCase();
            System.out.print(result + " ");
            a ++;
        }
    }
}
