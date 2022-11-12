package be.kdg;


// IMPORTING TO BE ABLE TO GET USER INPUT
import java.util.Scanner;
// ---------------------------------------

public class Question3 {
    public static void main(String[] args) {

        
        final int MAX_SIZE = 10;  // 1
        final int MIN_VALUE = 1;  // 2 
        final int MAX_VALUE = 15; // 3 
        final int STOP = -1; 
 

        // Initialize int array of size MAX_SIZE
        int[] numbers = new int[MAX_SIZE];


        // Fill array with random numbers from MIN_VALUE to MAX_VALUE
        java.util.Random gen = new java.util.Random(); 

        for(int i = 0; i < MAX_SIZE; i++){
            numbers[i] = gen.nextInt(MAX_VALUE)+1; 
            //System.out.println(numbers[i]);
        }


        // Print Output of Array

        // ** Storing the text format of the array for easier printing at later part
        StringBuilder arrayString =  new StringBuilder(numbers.length*2);
        for(int x : numbers){
            arrayString.append(x + " ");
        }


        // Ask User for Search Value:

        int toSearch = 0; 
        int counter = 0;
        while(toSearch != STOP){
            Scanner keyboard = new Scanner(System.in);

            System.out.println(arrayString);
            System.out.print("Enter a number to search for between " + MIN_VALUE + " and " + MAX_VALUE + " (" + STOP +  " to stop): ");
            toSearch = keyboard.nextInt();

            if(toSearch == STOP){continue;}

            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] == toSearch){counter++;}
            }

            //System.out.println("Number " + toSearch + " found " + counter + " time(s)\n");

            System.out.printf("Number %1$d found %2$d time(s)%n%n",toSearch,counter);
            counter = 0; 
        }

        System.out.println("Process finished");
        


    } // main()
    
}  // class

