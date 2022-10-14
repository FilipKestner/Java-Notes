//   _                                                                        
//  | |                             ___        /\                             
//  | |     ___   ___  _ __  ___   ( _ )      /  \   _ __ _ __ __ _ _   _ ___ 
//  | |    / _ \ / _ \| '_ \/ __|  / _ \/\   / /\ \ | '__| '__/ _` | | | / __|
//  | |___| (_) | (_) | |_) \__ \ | (_>  <  / ____ \| |  | | | (_| | |_| \__ \
//  |______\___/ \___/| .__/|___/  \___/\/ /_/    \_\_|  |_|  \__,_|\__, |___/
//                    | |                                            __/ |    
//                    |_|                                           |___/                                         
//####################################################################################################################################
//####################################################################################################################################

import java.sql.Array;

public class Loops_Arrays {

// Basic Loop Overview:
//  if( (SOME_CONDITION && SOME_OTHER_CONDITION) || OTHER_OTHER_CONDITION ) { ... }
//  if( SOME_CONDITION){} else {}
//  SOME_VAR = (SOME_CONDITION) ? TRUE_ACTION : FALSE_ACTION
//  while( SOME_CONDITION ){} -> **USE BREAKS
// 

// Not Basic Loops ()
//-----------------------------------------------------------------
    private static void Not_Basic_Loops(){
        int x = 0;
        boolean y = true;

        //Switch Statements
        // ** Good for error handling or very specific scenario catching
        // ++ NOTE THAT IF THERE IS NO BREAK IT WILL CONTINUE TO FALL THROUGH
        //    AND EXECUTE ANY COMMANDS THAT OCCUR! BREAK IS IMPORTANT UNLESS 
        //    YOU DO NOTHING IN CASES BEFORE IT! 
        switch(x){
            case 0: 
                System.out.println("x == 0"); //break;
            case 1:
                System.out.println("x == 1"); break;
            case 2:
                System.out.println("x == 2"); break;
            case 3:
                System.out.println("x == 3"); break; 
            default:
                break; 
        }

        // SIMPLIFIED Switch Statement:
        //  ** When multiple cases result in the same outcome
        //  then we use the simplified switch with '->' instead of ':'

        x = 3; 
        int z;
        switch(x){
            case 0,1,2 -> System.out.println("YOYOYO");
            case 3,4,5 -> System.out.println("FAT L");
            case 6 -> z = 1; 
            case 7 -> System.out.print("");
            default -> System.out.println("FAIL");
        }


        // Do/While Statement
        //  ** The loop executed at least once before the condition is checked.
        //  Basically a while loop with minimum 1 run. 

        // | do {
        // |      ...
        // | } while( SOME_CONDITION );
        do{
            x++;
            System.out.print(x + " | ");
        }while(x<5);
        System.out.println();

        // For Statement
        // | for ( STATEMENT_1; STATEMENT_2; STATEMENT_3){
        // |    ... 
        // | }
        for(int i = 0; i < 10; i++){

            if(i == 4){continue;} 
            // ** 'continue' ends the current iteration of the loop and goes to the next

        }

        

        // For Each Statement
        // | for(SOME_TYPE SOME_VAR : SOME_ITERRABLE_VAR){
        // |    ...
        // | }
        String[] someStringArray = {"String1","String2","String3"};
        for(String k : someStringArray){
            
        }
    }

    // ** MUST INCLUDE 
    // import java.sql.Array;
    private static void Arrays(){
        int x; 
        String[] someStringArray = {"ITEM_1", "ITEM_2", "ITEM_3"}; 
        // | SOME_TYPE[] VAR_NAME = {ITEM_1, ITEM_2, ITEM_3};


        // Multi-Dimensional Arrays:
        // ** Arrays can hold arrays there for you can make an N-Dimensional Array
        int[][] someMDArray = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};


        // Useful Array Properties:
        //      SOME_ARRAY.length;
        //      
        //  
        //
    }



    public static void main (String args[]){
        Not_Basic_Loops();
        //Arrays();

    }
}
