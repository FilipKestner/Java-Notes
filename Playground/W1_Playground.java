import java.time.LocalDate;
import java.util.Scanner;
import java.lang.Math;


public class W1_Playground {
    
//----------------------------------------------------------------------------------------------------------------------------------
    private static void getAge(){
        int some_year = LocalDate.now().getYear();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("Dear " + name + ", what year were you born in? ");
        int bornYear = keyboard.nextInt();

        System.out.println("If all goes well you'll be " + (some_year-bornYear) + " by the end of this year!");
    }
//----------------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------------------
    private static void mathOperation(){
        Scanner keyboard = new Scanner(System.in);

        int firstNum, secondNum; 
        String option;

        System.out.print("Enter a number: "); 
        firstNum = keyboard.nextInt(); 

        System.out.print("Enter another number: "); 
        secondNum = keyboard.nextInt(); 

        System.out.print("Select an operation (add/subtract/multiply/divide/exponent) :"); keyboard.nextLine();
        option = keyboard.nextLine();
        System.out.println();


        
        while(true){ 
        //  ( option.equals != "add" && option.equals    }
        //      != "subtract" && option.equals           } -> If you do it this way you can remove the 
        //      != "multiply" && option.equals           } -> 'break' statements. But less readable imo
        //      != "divide")                             }
            if(option.equals("add")) {
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
                break;
            }
            else if(option.equals("subtract")){
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));
                break;

            }
            else if(option.equals("multiply")){
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum*secondNum));
                break;

            }
            else if(option.equals("divide")){
                System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
                break;

            }
            else if(option.equals("exponent")){
                String expoString = "";

                for(int i = 0; i < secondNum;i++){
                    expoString += firstNum + "*"; 
                }

                System.out.println(firstNum +"^"+secondNum+ " = " + expoString.substring(0,expoString.length()-1) + " (= " + (firstNum^secondNum)+")");
                break;

            }
            else{
                System.out.println("Please enter a valid option (add/subtract/multiply/divide):");
                option = keyboard.nextLine();
            }    
        }

        keyboard.close(); 
    }

        private static void summation() {

            int number = 0;
            int sum = 0;
            int counter = 0;

            Scanner keyb = new Scanner(System.in);

            
            do{
                sum += number;
                counter++;
                System.out.print("Enter a number (to stop enter 0): ");
                number = keyb.nextInt();
            }while(number !=0);

            System.out.println("The sum of these numbers is: " + sum + " and you typed " + (counter - 1) + " numbers.");

        }
//----------------------------------------------------------------------------------------------------------------------------------

private static void laisMath(){
    int operation;
    int a, b, result;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a number: ");
    a = keyboard.nextInt();
    System.out.print("Enter another number: ");
    b = keyboard.nextInt();
    System.out.println("Choose an operation:\n" +
            "\t1 add\n" +
            "\t2 substract\n" +
            "\t3 multiply\n" +
            "\t4 divide\n" +
            "\t5 exponentiation");
    System.out.print("Your choice: ");
    operation = keyboard.nextInt();

    if (operation == 1) { //add
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }
    if (operation == 2) { //substract
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }
    if (operation == 3) { //product
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }
    if (operation == 4) { //divide
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }

    if (operation == 5) {
        int power = a; 
        for(int i = 1; i < b; i++){
            power *= a; 
        }
        System.out.println(a + " ^ " + b + " = " + power);
    }
}




//----------------------------------------------------------------------------------------------------------------------------------
        private static void Between(){
            int a, b, c; 
            Scanner keyboard = new Scanner(System.in);

            do{ // Keep asking until all 3 numbers are valid. Could be more complex if you want to make them repea
                // only one number at a time. 
                System.out.println("Please enter 3 valid numbers between 0-100.");
                System.out.print("Enter first num: ");
                a = keyboard.nextInt();

                System.out.print("Enter second num: ");
                b = keyboard.nextInt();

                System.out.print("Enter third num: ");
                c = keyboard.nextInt();
            }while( (a > 100 || a < 0) || (b > 100 || b < 0) || (c > 100 || c < 0));

            
            // You can simplify the checking like this:
            // a <= b && b <= c
            if( (b <= a && a <= c) || (c <= a && a <= b) ){
                System.out.println("A");
            }
            else if ((a <= b && b <= c) || (c <= b && b <= a)){
                System.out.println("B");
            }
            else if ((a <= c && c <= b) || (b <= c && c <= a)){
                System.out.println("C");
            }


        }
//----------------------------------------------------------------------------------------------------------------------------------



//------------------------------------------------------------------------------------


// public static void digitsv2() {
//     Integer number;
//     Scanner keyboard = new Scanner(System.in);

//     while (true) {
//         System.out.println("Enter a 4-digit whole number (1000..9999): ");
//         number = keyboard.nextInt();

//         if (number <= 1000 || number >= 9999) {
//             System.out.println("Make sure each digit lies in the range [0-9]!");
//             continue;
//         } 
        
        
//         char[] newNumber = (number.toString()).toCharArray();
//         int totalAddition = 0;
//         for(int i = 0; i < (number.toString()).length(); i++){
//             System.out.println((int)newNumber[i]);
//             totalAddition += (int) newNumber[i]; 


//         }

//         System.out.println("TOTAL SUM OF DIGITS = " + totalAddition);
//         break;
        
//     }
// }

public static void digitsv2() {
    Integer number;
    Scanner keyboard = new Scanner(System.in);

    while (true) {
        System.out.println("Enter a 4-digit whole number (1000..9999): ");
        number = keyboard.nextInt();

        if (number <= 1000 || number >= 9999) {
            System.out.println("Make sure each digit lies in the range [0-9]!");
            continue;
        } 
        
        
        
        for(int i = 0; i < (number.toString()).length(); i++){
            


        }

       
        break;
        
    }
}

//------------------------------------------------------------------------------------

public static void years(){

    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a month number(1 = January):");
    int monthNumber = kb.nextInt(); 
    int yearNumber;

    String printString = "";

    System.out.println("Enter a year number:");
    yearNumber = kb.nextInt();

    // ** Remember, you have to put a 'break' after each case in the switch statements
    // ** We also create a string and print it at the end, so we just have 1 println instead of 13. 

    switch(monthNumber){
        case 1:
            printString += ("In " + yearNumber + ", January has 31 days.");
        case 2: 
            // ** If something is divisible by 400, it is also divisible by 4 so e only have check
            //    yearNumber%4==0 and not yearNumber%400 == 0
            if(yearNumber%4 == 0){printString += ("In " + yearNumber + ", February has 29 days.");} 
            else{printString += ("In " + yearNumber + ", February has 28 days.");}
            break;
        case 3: 
            printString += ("In " + yearNumber + ", March has 31 days.");
            break;
        case 4: 
            printString += ("In " + yearNumber + ", April has 30 days.");
            break;
        case 5: 
            printString += ("In " + yearNumber + ", May has 31 days.");
            break;
        case 6: 
            printString += ("In " + yearNumber + ", June has 30 days.");
            break;
        case 7: 
            printString += ("In " + yearNumber + ", July has 31 days.");
            break;
        case 8: 
            printString += ("In " + yearNumber + ", August has 31 days.");
            break;
        case 9: 
            printString += ("In " + yearNumber + ", September has 30 days.");
            break;
        case 10:
            printString += ("In " + yearNumber + ", October has 31 days.");
            break;
        case 11:
            printString += ("In " + yearNumber + ", November has 30 days.");
            break;
        case 12: 
            printString += ("In " + yearNumber + ", December has 31 days.");
            break;
        default:
            printString = "You dummy, how can you select that number for months...";
        
    }

    System.out.println(printString);


}

//------------------------------------------------------------------------------------


public static void doubleDivisble(){
    Scanner kb = new Scanner(System.in);
    int div1 = -1;
    int div2 = -1;

    int divCounter = 1;
    String printString = "";

    while(div1 != 0 || div2 != 0){ // Only steps when you enter '0' for both values
        System.out.print("Enter the first divisor: ");
        div1 = kb.nextInt(); 
    
        System.out.print("Enter the second divisor: ");
        div2 = kb.nextInt(); 


        if(div1 > 0 && div2 > 0){ // Checking for positive
            for (int i = 1; i <= 1000; i++){

                if(i%div1 == 0 && i%div2 == 0){
                    // We are essentially building a string and printing it every time
                    // total amount of valid numbers found = 10. Then we reset it to an empty string.
                    printString = printString + String.format("%4d ",i);
                    //                          ^^^^^^^^^^^^^ String.format is basically taking the formatting
                    //                          from printf() and saving it as a variable instead of having to
                    //                          actually print it/ 
                    divCounter+=1;
                }

                if(divCounter%11 == 0){ 
                    // ** We have to do divCounter = 1 and divCounter%11 because if we do:
                    //      | divCounter = 0;
                    //      | divCounter%10 == 0 => THIS RETURNS TRUE IF divCounter = 0
                    printString = printString + '\n';
                    System.out.print(printString);
                    printString = "";
                    divCounter = 1;
                }
            }
        }
    }
}




    public static void main(String args[]){
        //getAge();
        //mathOperation();
        //laisMath();
        //summation();
        //Between();
        //digitsv2();
        //years();
        doubleDivisble();
        

    }
}
