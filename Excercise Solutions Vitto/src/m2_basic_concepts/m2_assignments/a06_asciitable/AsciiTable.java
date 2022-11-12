package m2_basic_concepts.m2_assignments.a06_asciitable;

public class AsciiTable {
    public static void main(String[] args) {
        int c;

        for(c = 32; c < 128 ; c++){
            System.out.print((char)c + "(" + c + ") ");
            if(c%6 == 0){
                System.out.print("\n");
            }
        }
    }
}
