package m3_basic_concepts.a03_loops;

public class Loops {
    public static void main(String[] args) {
        int first = 120;
        double third = 5;
        double thirdCurrent = 5;
        double thirdMultiplier = 1;
        char fourth = 65;

        int counter = 120;
        do {
            System.out.print(counter + " ");
            counter --;
        }while(counter >= 100);
        System.out.println();

        counter = 1;
        while (counter < 50){
            if (counter % 3 == 0){
                System.out.println(counter);
            }
            counter++;
        }
        System.out.println();

        while (thirdCurrent < 10000){
            thirdCurrent = Math.pow(third, thirdMultiplier);
            System.out.print(thirdCurrent < 10000 ? thirdCurrent : " ");
            thirdMultiplier ++;
        }
        System.out.println();
        while (fourth < 91){
            System.out.print(fourth + " ");
            fourth ++;
        }
    }
}
