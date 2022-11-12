public class P0_Formatting_REGEX {


    private static void formatted_printing(){
        // To format text in Java we use 'printf'


        // { %[flags] [width] [.precision] conversion-character } 
        // | System.out.printf( "FORMAT_STRING" , arg1, arg2, ... , argN); 



        // FLAG CHARACTERS:
        // +--------+----------------------------------------------------------------------------------------+
        // | FLAG:  |                                        PURPOSE:                                        |
        // +--------+----------------------------------------------------------------------------------------+
        // | -      | left-justify ( default is to right-justify )                                           |
        // | +      | output a plus ( + ) or minus ( - ) sign for a numerical value                          |
        // | 0      | forces numerical values to be zero-padded ( default is blank padding )                 |
        // | ,      | comma grouping separator (for numbers > 1000)                                          |
        // | ' '    | space will display a minus sign if the number is negative or a space if it is positive |
        // +--------+----------------------------------------------------------------------------------------+

        //  -----------------------------------------------------------------------------------
        // | CONVERSION CHARACTERS:                                                            |
        // |-----------------------------------------------------------------------------------|
        // | CHARACTER   |                         PURPOSE                                     |       
        // |-----------------------------------------------------------------------------------|
        // |    %d       |  Decimal [byte, short, int, long]                                   |
        // |    %f       |  Float   [float, double]                                            |
        // |    %c       |  Char    [char]   ** '%C' will UPPERCASE the char                   |
        // |    %s       |  String  [String] ** '%S' will UPPERCASE the String                 |
        // |    %h       |  Hashcode, useful for printing references                           |
        // |    %n       |  Newline, to be used instead of '\n' for greater compatability      |
        // |-----------------------------------------------------------------------------------|

        // [width]      -> MINIMUM number of characters to written to the output 
        // [.precision] -> Specifies precision when outputing floating points 


        // { %[flags] [width] [.precision] conversion-character } 

        int z = 10;
        System.out.printf("Some Decimal: %d,%n", z);


        float x = (float)1.123456;
        System.out.printf("Total: %-10.2f: %n", x);
        System.out.printf("Total: %-10.4f: %n", x);
        System.out.printf("Total: %-5.2f: %n", x);
        System.out.printf("Total: %5.2f: %n", x);



        // Creating Formatted Variables using String.format()
        
        //      %[argument_index$][flags][width][.precision]conversion :=  General, Character & Numeric Types
        //          [argument_index$] := indicates the position of the variable in the argument list
        //          [flags]           := modifies output format
        //          [width]           := positive decimal integer indicating minimum number of characters to be written to output
        //          [.precision]      := non-negative integer restricting number of characters
        //          conversion        := the variable type

        //      %[argument_index$][flags][width]conversion := dates and times
        //      %[flags][width]conversion := does not correspond to arguments 
  
        String title = "THIS IS ALSO A TITLE";

        String fString = String.format("%1$"+10+"s %s%n ",title);
        //System.out.println(fString);

        
        System.out.println(String.format("|%1$30s","THIS IS A TITLE"));
        System.out.println(String.format("%1$-30s|",title)); // padded spaces

        int year = 1995;
        System.out.println( String.format("%1$-30s%2$d",title,year));



    }



    public static void main(String args[]){
        formatted_printing();
    }
    
}
