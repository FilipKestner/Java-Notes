//       __ __ _____                                 _   _____          __          
//      / // // ____|                               | | |_   _|        / _|         
//     / // /| |  __   ___  _ __    ___  _ __  __ _ | |   | |   _ __  | |_  ___     
//    / // / | | |_ | / _ \| '_ \  / _ \| '__|/ _` || |   | |  | '_ \ |  _|/ _ \    
//   / // /  | |__| ||  __/| | | ||  __/| |  | (_| || |  _| |_ | | | || | | (_) |   
//  /_//_/    \_____| \___||_| |_| \___||_|   \__,_||_| |_____||_| |_||_|  \___/    
//   ______  ______  ______  ______  ______  ______  ______  ______  ______  ______ 
//  |______||______||______||______||______||______||______||______||______||______|
//
//##################################################################################################################################     
//##################################################################################################################################                                                                             

import java.util.Scanner;

public class General_Info {

// General Formatting Rules:
//------------------------------------------------------------------------------------------------------------------------------------------------
//   ________________________________________________________________________
//  | public class FILE_NAME {                                               | ** Every file is considered a CLASS and therefor all code must be
//  |                                                                        | ecompassed in 'public class FILE_NAME'
//  |                                                                        |   
//  |                                                                        |  
//  |   private static void SOME_FUNCTION_NAME(PARAM_TYPE PARAM NAME, ...)   | ** Create other functions that can be called in the main.
//  |                                                                        | Ignore 'private', 'static', they are mutable. 'void' is the
//  |                                                                        | function return type. 
//  |                                                                        |   
//  |                                                                        |   
//  |                                                                        |   
//  |                                                                        |   
//  |   public static void main (String[] args){                             | ** In order to run code when called the file must also have 
//  |                                                                        | a 'main' function. Ignore parameters they are mutable. 
//  |   }                                                                    |
//  | }                                                                      |
//  |                                                                        |   
//  |________________________________________________________________________|   
//------------------------------------------------------------------------------------------------------------------------------------------------

// General Input & Output:
// --------------------------------------------------------------------------------------------
    private static void generalIO(){
        
        // System.out.println("SOME SORT OF TEXT");
        System.out.println("test");
        //     *'println' automatically includes escape characters '\n' & '\r' at the 
        //      end of text signaling adding a newline and also effectively ending the ouput. 

        System.out.print("NO NEW LINE & NO CARRIAGE RETURN | ");          // -> IMPROPER
        System.out.print("NOW WE ADD A NEW LINE AND CARRIAGE RETURN \r"); // -> PROPER
        System.out.println();

        // **A string output to terminal must ALWAYS end with \r, but newlineChar \n is not neccessary.
        // More info on escape characters in the 'JavaStrings' section of notes.

        // GETTING INPUT FROM USER OR OTHER SOURCES:
        // 1: To get input you must import:
        // | import java.util.Scanner;
        //
        // 2: Declare a scanner to retrieve input from
        // | Scanner SOME_SCANNER_NAME = new Scanner(SOME_FORM_OF_INPUT)
        //
        // 3: Read user input:
        // | SOME_TYPE SOME_VAR = SOME_SCANNER.nextBoolean();
        // |                                  .nextByte();
        // |                                  .nextDouble();
        // |                                  .nextFloat();
        // |                                  .nextInt();
        // |                                  .nextLine(); -> USE FOR STRINGS
        // |                                  .nextLong();
        // |                                  .nextShort();

        Scanner keyboard = new Scanner(System.in); // 'System.in' is basically keyboard input
        String someString = keyboard.nextLine();   // Reads next line given via terminal 

        // ************* Does .nextLine() append newline char? carriage return char? ******************
    }
// --------------------------------------------------------------------------------------------

// Variables & Data Types General:
// --------------------------------------------------------------------------------------------
    private static void generalVars(){
        // Common Data Types:
        String  someString = "someString"; // -> String            ** NOTICE HOW 'String' IS THE ONLY CAPITAL? BECAUSE IT IS ALSO AN 'OBJECT'
        char    someChar   = 's';          // -> Character
        int     someInt    = 12345;        // -> Whole Number
        boolean someBool   = true;         // -> True or False

        float   someFloat  = 1.3440004f;    // -> Number with UP TO 7 DECIMALS (32-bit)
        double  someDouble = 1.344000454d;    // -> Number with UP TO 15 DECIMALS (64-bit)
        System.out.println("FLOAT: " + someFloat + " | " + "DOUBLE: " + someDouble);

        // ** can use 'e' to indicate a power of 10. Good for precision and also downsizing larger numbers
        float scientificFloat = 2.34e6f;
        System.out.println(scientificFloat);

        // ** Chars can also hold ASCII values and not just single chars like 'b' or 'B'
        char someASCII1 = 66, someASCII2 = 123, someASCII3 = 126;
        System.out.println(someASCII1 + " | " + someASCII2 + " | " + someASCII3);

        // Primitive Data Types + Size of Variables:
        // ******************************************************************************************************************
        //     Data Type      |       Size       |            Description & Range (Inclusive) Of Possible Values            | 
        // -------------------+------------------+--------------------------------------------------------------------------+
        //      byte          |     1-bytes      | Whole Number [-127 <-> 127]                                              |
        //     short          |     2-bytes      | Whole Number [-32,768 <-> 32,768]                                        |
        //      int           |     4-bytes      | Whole Number [2,147,483,648 <-> 2,147,483,647]                           |
        //      long          |     8-bytes      | Whole Number [-9,223,372,036,854,775,808 <-> 9,223,372,036,854,775,807]  |
        //     float          |     4-bytes      | Fraction w/ UP TO 7 Decimal Digits                                       |
        //     double         |     8-bytes      | Fraction w/ UP TO 15 Decimal Digits                                      |
        //     boolean        |     1-bit        | true or false (1 or 0)                                                   |
        //     char           |     2-bytes      | Single Character, Letter or ASCII vlaue                                  |
        // ******************************************************************************************************************
    }

// --------------------------------------------------------------------------------------------

    private static void strings(){
        // Strings are immutable and whenever you change a String object, another one 
        // is created. This results in an INSANE amount of memory usage and can be come
        // very costly. The solution? The Stringbuilder Class


        // Stringbuilder:
        //      -> Creates mutable String like objects

        // | Stringbuilder()                  -> Empty builder w/ DEFAULT_CAPACITY = 16
        // |       . . .
        // | Stringbuilder(String str)        ->
        // |       . . .
        // | Stringbuilder(int length)        ->

        StringBuilder strBA = new StringBuilder(10);
        StringBuilder strBB = new StringBuilder("Testing String");


        // List of StringBuilder Methods: 
        // +------------------------------------------------------------------------+---------------------------------------------------------------------------------------------------------------------------+
        // |                                 Method                                 |                                                    Description                                                            |
        // +------------------------------------------------------------------------+---------------------------------------------------------------------------------------------------------------------------+
        // | public StringBuilder append(String s)                                  | It is used to append the specified string with this string. The append() method is overloaded like append(char),          |
        // |                                                                        |   append(boolean), append(int), append(float), append(double) etc.                                                        |
        // | public StringBuilder insert(int offset, String s)                      | It is used to insert the specified string with this string at the specified position. The insert() method is              |
        // |                                                                        |   overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc. |
        // | public StringBuilder replace(int startIndex, int endIndex, String str) | It is used to replace the string from specified startIndex and endIndex.                                                  |                                                                                                                                        |
        // | public StringBuilder delete(int startIndex, int endIndex)              | It is used to delete the string from specified startIndex and endIndex.                                                   |                                                                                                                                                               |
        // | public StringBuilder reverse()                                         | It is used to reverse the string.                                                                                         |                                                                                                                                                                                                     |
        // | public int capacity()                                                  | It is used to return the current capacity.                                                                                |                                                                                                                                                                                            |
        // | public void ensureCapacity(int minimumCapacity)                        | It is used to ensure the capacity at least equal to the given minimum.                                                    |                                                                                                                                                                 |
        // | public char charAt(int index)                                          | It is used to return the character at the specified position.                                                             |                                                                                                                                                                       |
        // | public int length()                                                    | It is used to return the length of the string i.e. total number of characters.                                            |                                                                                                                                                       |
        // | public String substring(int beginIndex)                                | It is used to return the substring from the specified beginIndex.                                                         |                                                                                                                                                                |
        // | public String substring(int beginIndex, int endIndex)                  | It is used to return the substring from the specified beginIndex and endIndex.                                            |                                                                                                                                                      |
        // +------------------------------------------------------------------------+---------------------------------------------------------------------------------------------------------------------------+


 


    }
// --------------------------------------------------------------------------------------------




// --------------------------------------------------------------------------------------------

    
    public static void main(String[] args){
        generalIO();
        generalVars();
    }
}
//-------------------------------------------------------------------------------------------





//##################################################################################################################################     
//################################################################################################################################## 

