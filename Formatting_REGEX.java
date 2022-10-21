public class Formatting_REGEX {


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




    }



    public static void main(String args[]){
        formatted_printing();
    }
    
}
