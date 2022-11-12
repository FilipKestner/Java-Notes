
import java.util.Scanner;
public class W4_Playground {

    static void summation(){

        Scanner kb = new Scanner(System.in);

        int totSum = 0; 
        int nextAdd;
        while(true){
            nextAdd = kb.nextInt();
            if(nextAdd == 0){break;}
            totSum += nextAdd;
        }
        System.out.println(totSum);
        

    }


    static void inBetween(){

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number (0-100):");
        int num1 = kb.nextInt();

        System.out.print("Enter a number (0-100):");
        int num2 = kb.nextInt();

        System.out.print("Enter a number (0-100):");
        int num3 = kb.nextInt();

        if( (num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3) ){System.out.println(num1 + " is the middle number");}
        else if((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3) ){System.out.println(num2 + " is the middle number");}
        else{System.out.println(num3 + " is the middle number");}

    }

    static void encode(){
        Scanner kb = new Scanner(System.in);


        System.out.print("Enter a phrase and we will encrypt it: ");

        String somePhrase = kb.nextLine();
        somePhrase = somePhrase.toUpperCase();

        System.out.println(somePhrase);
        System.out.println((byte)somePhrase.charAt(0));        
    }

// Excercises: 
// ---------------------------------------------------------------------------------------------------------------

    static void problem4p5(){ // Compare Strings
        // 1st -> 2nd
        // 1st -> 3rd
        // 2nd -> 3rd

        String stringOne = "java";
        String stringTwo = "Jakarta";
        String stringThree = "JAVA";


        char[] strOne   = stringOne.toLowerCase().toCharArray();
        char[] strTwo   = stringTwo.toLowerCase().toCharArray();
        char[] strThree = stringThree.toLowerCase().toCharArray();

        boolean c1 = true;
        boolean c2 = true;
        boolean c3 = true;

        // 1st -> 2nd
        if(strOne.length == strTwo.length){
            for(int i = 0; i < strOne.length; i++){
                if(strOne[i] == strTwo[i]){continue;}
                else{
                    c1 = false;//System.out.println(stringOne + " and " + stringTwo + " are not equal");
                    break;
                }
            }
        }
        else{c1 = false;}
        // 1st -> 3rd
        if(strOne.length == strThree.length){
            for(int i = 0; i < strOne.length; i++){
                if(strOne[i] == strThree[i]){continue;}
                else{
                    c2 = false;//System.out.println(stringOne + " and " + stringTwo + " are not equal");
                    break;
                }
            }
        }
        else{c2 = false;}


        // 2nd -> 3rd
        if(strTwo.length == strThree.length){
            for(int i = 0; i < strTwo.length; i++){
                if(strTwo[i] == strThree[i]){continue;}
                else{
                    c3 = false;//System.out.println(stringOne + " and " + stringTwo + " are not equal");
                    break;
                }
            }
        }
        else{c3 = false;}


        if(c1){System.out.println(stringOne + " and " + stringTwo + " are equal");} else{System.out.println(stringOne + " and " + stringTwo + " are not equal");}

        if(c2){System.out.println(stringOne + " and " + stringThree + " are equal");} else{System.out.println(stringOne + " and " + stringThree + " are not equal");}

        if(c3){System.out.println(stringTwo + " and " + stringThree + " are equal");} else{System.out.println(stringTwo + " and " + stringThree + " are not equal");}
    }



    private static void problem4p6(){ // Count number of times a substring appears 
        String base = "The more you learn, the less you know";
        String[] splitString = base.split("ou");
        int amount = splitString.length - 1;

        //System.out.println(splitString[0]);
        //for(int i = 0;i < splitString.length;i++){System.out.println(splitString[i]);}

        System.out.println(base);
        System.out.println("Substring \"ou\" appears " + amount + " times");

    }

    private static void problem4p7(){
        // ** I didnt do the include an extra space but its very straight forward.
        // You just gotta put 1. Intialis into a while loop as the rest of them 
        // it doesn't matter if theres an extra space or not. 


        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your first & last name (as 'FIRST_NAME LAST_NAME')");
        String nameLine = kb.nextLine(); 

        StringBuilder sb = new StringBuilder(nameLine);

        // 1 -> Initials
        char first  = sb.charAt(0);
        char second = sb.charAt( sb.indexOf(" ")+1);
        System.out.printf("%c%c%n",first,second);


  

        // 2 -> Reversed Name
        System.out.println(sb.reverse());
        sb.reverse(); 
        //System.out.println(sb);

        // 3 -> Name with 'e' replaced with 'a' (NO .replace or .replaceALL)
        String sbCopy = sb.toString();
        for(int i = 0; i < sb.length(); i++) {

            if(sb.charAt(i) == 'e'){
                sb.insert(i,'a');
                sb.delete(i+1,i+2);
            }

            //System.out.println(sb);

        }

        //System.out.println(sb);

        sb = new StringBuilder(sbCopy); // Make sb the original name again after altering

        // 4 -> All characters in random order

        StringBuilder rand = new StringBuilder(sb.length());

        java.util.Random gen = new java.util.Random(); 
        int randInt; 

        for(int i = 0; i < sb.length(); ){

            randInt = gen.nextInt(sb.length());

            rand.append(sb.charAt(randInt));

            sb.deleteCharAt(randInt);

            //System.out.println(sb);
            
        }

        //System.out.println(sbCopy);
        System.out.println(rand);



    }

    private static void problem4p8(){ // Palindrome Using String Builder
        Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter a word: ");

            StringBuilder word = new StringBuilder(keyboard.nextLine());

            StringBuilder reverse = new StringBuilder(word.toString());
            reverse.reverse();


            //System.out.println(word);
            //System.out.println(reverse);

            for(int i = 0; i < (word.length()/2); i++){
                if (word.charAt(i) != reverse.charAt(i)){
                    System.out.println("NOT A PALINDROME");
                    return;
                }


            }

            System.out.println("IS A PALINDROME");
    }

    private static void problem4p9(){ // Verifying User Input
        final int LOWER_BOUND = 1;
        final int UPPER_BOUND = 20;
        final int STRING_BUILDER_CAP = 100;
        String qString = "Enter a number between " + LOWER_BOUND + " and " + UPPER_BOUND + " to count to: ";

        Scanner keyboard = new Scanner(System.in);

        System.out.print(qString);

       
        StringBuilder printString = new StringBuilder(STRING_BUILDER_CAP);


        int num_to_count = -1; 
        String input;
         
        while(true){

            if(num_to_count == 0){break;}


            while(!keyboard.hasNextInt()){
                input = keyboard.next();
                System.out.println("You didn't enter a number!");
            }
            
            num_to_count = keyboard.nextInt();

            if(num_to_count < LOWER_BOUND || num_to_count > UPPER_BOUND){
                System.out.println("ENTER A VALIUD NUMBER");
                continue; 
            }

            for(int i = LOWER_BOUND; i <= num_to_count; i++){
                printString.append(i);
                System.out.print(i);
                System.out.print(' ');

            }
            System.out.println();
            System.out.println(printString);
            break;
            
        }

    }


    private static void problem4p10(){
        final int AMOUNT = 5;
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        // Read AMOUNT words and append each word to the StringBuilder.
        // Use a for-loop and 'printf'.

        for(int i = 0; i < AMOUNT; i++){
            System.out.printf("Enter word %d: ", i);
            builder.append(scanner.next()+ ' ');


        }
        System.out.println();
        
        // Print the content of 'builder'.
        System.out.println("Content of 'builder': " + builder);

        // Create a copy of the StringBuilder object and name it 'copy'. Make sure it contains
        // the same content as the original StringBuilder.
        // Print the content of 'copy'.
        StringBuilder copy = new StringBuilder (builder.toString());
        System.out.println("Content of 'copy': " +copy);
        System.out.println();

        // Now check if 'builder' has the same content as 'copy'. Try '==' as well as the 'equals' method.
        // Note: unlike 'String', 'StringBuilder' doesn't actually have an implementation of the 'equals'
        // method. Yet, we can still call the 'equals' method on objects of type StringBuilder.
        // This will be explained later on! (You might want to take a look at the 'Object' class.)
        System.out.println("Comparison with '==': " + (builder==copy));
        System.out.println("Comparison with .equals(): " + (builder.equals(copy)));
        System.out.println();


        // Convert builder to upper case without using the String class and without creating
        // a new StringBuilder.
        // Hint: use an ASCII table.
        for(int i = 0; i < builder.length(); i++){

            if((byte)builder.charAt(i) != 32){
                builder.replace(i,i+1, ""+ (char)(((byte)builder.charAt(i)) - 32));

            }

            //System.out.println( (byte)builder.charAt(i));

        }

        System.out.println("Upper case: " + builder);

            
    }

    public static void main(String args[]){
        //summation();
        //inBetween();
        //encode(); 

        //problem4p5();
        //problem4p6();
        //problem4p7();
        //problem4p8();
        problem4p9();
        //problem4p10();
    }
    
}
