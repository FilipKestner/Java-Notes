//    ____                       _                            _______                  _____          _   _             
//   / __ \                     | |                   ___    |__   __|                / ____|        | | (_)            
//  | |  | |_ __   ___ _ __ __ _| |_ ___  _ __ ___   ( _ )      | |_   _ _ __   ___  | |     __ _ ___| |_ _ _ __   __ _ 
//  | |  | | '_ \ / _ \ '__/ _` | __/ _ \| '__/ __|  / _ \/\    | | | | | '_ \ / _ \ | |    / _` / __| __| | '_ \ / _` |
//  | |__| | |_) |  __/ | | (_| | || (_) | |  \__ \ | (_>  <    | | |_| | |_) |  __/ | |___| (_| \__ \ |_| | | | | (_| |
//   \____/| .__/ \___|_|  \__,_|\__\___/|_|  |___/  \___/\/    |_|\__, | .__/ \___|  \_____\__,_|___/\__|_|_| |_|\__, |
//         | |                                                      __/ | |                                        __/ |
//         |_|                                                     |___/|_|                                       |___/ 
//
//####################################################################################################################################################    
//####################################################################################################################################################    
//import java.lang.Math;

public class Operators_TypeCasting {
    
// Type Casting:
// --------------------------------------------------------------------------------------------
    private static void TypeCasting(){
    //  Type Casting in changing the type of a variable in order
    //  to decrease (narrow) or increase (widen) its size.

    // SMALLER
    // |----------------------- WIDENING ---------------------------->>
    //   byte <-> short <-> char <-> int <-> long <-> float <-> double
    // <<--------------------- NARROWING -----------------------------|
    //                                                                BIGGER

    //  ** Widening is done automatically by Java but to narrow types 
    //  IT MUST BE DONE MANUALLY

    // AUTOMATIC
    int someInt = 10;            // -> 10
    double someDouble = someInt; // -> 10.0
    System.out.println("DOUBLE: " + someDouble + " | INT: " + someInt);  

    // MANUAL
    someDouble = 9.87;           // -> 9.87
    someInt = (int)someDouble;   // -> 9
//  someInt = someDouble         | DOES NOT WORK AND WONT LET YOU RUN/COMPILE
    System.out.println("DOUBLE: " + someDouble + " | INT: " + someInt);
    }
// --------------------------------------------------------------------------------------------


// Operators:
// --------------------------------------------------------------------------------------------
    private static void Operators(){
    // Basic Operators:
        // ** Operators that only need 1 variable to function are called 'Unary Operators'
        int x = 10, y = 2, z = 0;

        z = x + y; // | Addition
        z = x - y; // | Subtraction
        z = x * y; // | Multiplication
        z = x / y; // | Division
        z = x % y; // | Modulus Division
        z = x ^ y;

    
        
        z++;       // | Increment      | ** The difference between Normal & Pre-Increment/Decrement
        ++z;       // | Pre-Increment  | is when we want the operation to take place. i++ would increase
                   //                  | the value of 'i' AFTER an operation is complete whereas ++i
        --z;       // | Decrement      | would FIRST INCREMENET then COMPLETE OPERATION.
        z--;       // | Pre-Decrement  |



        z = x++;                           // | z = 11
        System.out.println(z + " | " + x); // | x = 11

        z = ++x;                           // | z = 10
        System.out.println(z + " | " + x); // | x = 11

    // Assignment Operators: 
        x = 10; y = 2; z = 0;
        z = x;  // | Standard Assignemnt 
        z += x; // | Add          & Assign
        z -= x; // | Subtract     & Assign
        z *= x; // | Multiply     & Assign
        z /= x; // | Divide       & Assign
        z %= x; // | Modulus      & Assign
        z ^= x; // | Exponentiate & Assign

    // Comparison Operators:
        x = 10; y = 2; 
        boolean someBool;
        someBool = x == y; // '==' -> Equal to
        someBool = x > y;  // '>'  -> L greater than R
        someBool = x < y;  // '<'  -> L less than R
        someBool = x != y; // '!=' -> Not Equal to
        someBool = x >= y; // '>=' -> L greater or equal to R
        someBool = x <= y; // '<=' -> L less or equal to R

    // Logical Operators:
        // '&&' -> logical AND
        // '||' -> logical OR
        // '!'  -> logical NOT

    // Escape Characters: 
        // \t - tab.
        // \b - backspace (a step backward in the text or deletion of a single character).
        // \n - new line.
        // \r - carriage return. ()
        // \f - form feed -> new page
        // \' single quote.
        // \" double quote.
        // \\ backslash.
        
        
    // Bitwise Operators
        //*******************************************************************************************
        // OPERATOR |      DESCRIPTION     |   EXAMPLE  |      SAME AS      | RESULT | DECIMAL RESULT
        // ---------+----------------------+------------+-------------------+--------+---------------
        //    '&'   |    AND               |    5 & 1   |    0101 & 0001    |  0001  |      1
        //    '|'   |    OR 	           |    5 | 1 	|    0101 | 0001 	|  0101  |      5
        //    '~' 	|    NOT 	           |     ~ 5 	|       ~0101 	    |  1010  |	    10    -> FLIPS ALL BITS
        //    '^'   | 	 XOR 	           |    5 ^ 1 	|    0101 ^ 0001 	|  0100  |	    4     -> COMPARES EACH BIT AND KEEPS SAME SLOTS
        //    '<<'  |  left shift          |    5 << 1 	|    0101 << 1 	    |  1010  |  	10
        //    '>>'  | right shift          |    5 >> 1 	|    0101 >> 1 	    |  0010  |	    2
        //   '>>>' 	| unsigned right shift |	5 >>> 1 |	0101 >>> 1 	    |  0010  |	    2
        //*******************************************************************************************
            // ** +(SOME_BYTE_SHORT_CHAR) -> PROMOTES BYTE, SHORT OR CHAR INTO INT 
                byte b = 1;
                short s = 1; 
                char c = 'c'; 
                z = +b;  
                z = +s;
                z = +c; 
              
        
        // ** QUICK NUMBER SYSTEM RECAP:
        //  0x... -> HEXADECIMAL NUMBER
        //  0...  -> OCTAL NUMBER
        //  0b... -> BINARY NUMBER

        // ** Remember if you put a '0' infront of a 
        // number it instantly becomes octal base. YOU ARE 
        // NO LONGER WORKING WITH DECIMAL NUMBERS!!!
        int zzz = 011;  // == 9 
        System.out.println(zzz);

        long b1 = 0b111111111101; // == 4093
        long b2 = 0b000000000010; // == 2
        long b3 = b1 >>> 2;      // == 1023

        // 1 1 1 1 1 1 1 1 1 1 0 1
        // 0 0 0 0 0 0 0 0 0 0 1 0 

        System.out.println("B1: " + b1);
        System.out.println("B2: " + b2);
        System.out.println("B3: " + b3);

        //System.out.println(Math.abs(x));

    }
// --------------------------------------------------------------------------------------------

    public static void main (String args[]){
        TypeCasting();
        Operators();

    }
}

//####################################################################################################################################################    
//#################################################################################################################################################### 
