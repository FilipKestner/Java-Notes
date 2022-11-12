package be.kdg;

import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    int number;
    Scanner kbd = new Scanner(System.in);

    // TODO Repeat the following question until the user has entered a positive number
    // -----------------------------------------------------------------------------------
    // Initial Asking
    System.out.print("Enter the starting number for the series: ");
    number = kbd.nextInt();

    // Repeat until VALID INPUT 
    // ** Assume that user input is of TYPE 'int'
    while(number < 1) { 
      System.out.println("Please enter a positive number.");
      System.out.print("Enter the starting number for the series: ");
      number = kbd.nextInt();
    }
    // -----------------------------------------------------------------------------------
    



    // TODO calculate series
    //      example 4/1 + 3/2 + 2/3 + 1/4
    // -----------------------------------------------------------------------------------
    System.out.println("Calculating the series for " + number+"..."); // Initiate


    float nLOWER = 1;       // := lower limit cursor (1)
    float nUPPER = number;  // := upper limit cursor (number)
    float total = 0;        // := summation storage variable
    // ** All are of type 'float' to ensure precision for
    //    rounding later on. 

    for(int i = 0; i < number; i++ ){
      total = total + (nUPPER/nLOWER); 

      nLOWER++;
      nUPPER--;

    }
    // -----------------------------------------------------------------------------------



    // TODO print result with a precision of 2 decimals e.g. 6.42
    // -----------------------------------------------------------------------------------
    System.out.printf("The sum is %5.2f. %n", total);
    // -----------------------------------------------------------------------------------
  }

}
