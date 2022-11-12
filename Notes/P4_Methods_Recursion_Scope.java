//   __  __      _   _               _                      _____                          _             
//  |  \/  |    | | | |             | |      _      ___    |  __ \                        (_)            
//  | \  / | ___| |_| |__   ___   __| |___ _| |_   ( _ )   | |__) |___  ___ _   _ _ __ ___ _  ___  _ __  
//  | |\/| |/ _ \ __| '_ \ / _ \ / _` / __|_   _|  / _ \/\ |  _  // _ \/ __| | | | '__/ __| |/ _ \| '_ \ 
//  | |  | |  __/ |_| | | | (_) | (_| \__ \ |_|   | (_>  < | | \ \  __/ (__| |_| | |  \__ \ | (_) | | | |
//  |_|  |_|\___|\__|_| |_|\___/ \__,_|___/        \___/\/ |_|  \_\___|\___|\__,_|_|  |___/_|\___/|_| |_|
//
//
//##################################################################################################################################     
//##################################################################################################################################                                                                                                       
                                                                                                      

public class P4_Methods_Recursion_Scope {

// General Structure of a Method:
//        ______________________________________________________________________________
//       | public class FILE_NAME {                                                     | 
//       |                                                                              | 
//       |                                                                              | 
//       |                                                                              | ** SCOPE
//       |                                                                              | ** STATIC?
//       |  SCOPE STATIC? RETURN_TYPE FUNCTION_NAME ( PARAM_TYPE PARAM_NAME, ...) {     | ** RETURN_TYPE
//       |         ...                                                                  | ** FUNCTION_NAME
//       |         ...                                                                  | ** PARAM_TYPE PARAM_NAME
//       |         ...                                                                  |
//       |  }                                                                           |
//       |                                                                              | 
//       | }                                                                            |  
//       |______________________________________________________________________________| 


// Scope (Variables & Methods)
//----------------------------------------------------------------------------------------------------------------------------------
    private static void Scope(){
//      SCOPE ()  -> 'private' || 'public' || 'protected' || NO_MODIFIER (aka package-private)
//              Scope defines exactly what you'd expect: the scope the variable can be accessed from.
//              'private'   ~ Only the class itself can access the method 
//              'public'    ~ Anything can access from anywhere
//                  *********************************************************************************************************** > 
//                  ***************** WHEN USING 'public' IN CLASS METHODS, YOU CAN ONLY CALL THE METHOD FROM ***************** > CONSIDER 'static' AND 'public' AS
//                  ************************** A CREATED OBJECT. NOT WITHOUT ONE LIKE STATIC ********************************** > OPPOSITES IN CASE OF CLASS METHODS
//                  *********************************************************************************************************** >
//              'protected' ~ Only acessable by subclasses
//              NO_MODIFIER ~ This defaults to something called package-private. Basically it only 
//                            applies to variables. 'int j' is package-private where it is only
//                            accessable by the same package i.e. in the same block of code. 
//
//                  ** What is a (java) PACKAGE? I still dont know for sure tbh 
//                  ** ==> 'package' basically refers to a directory 
//
//                +--------------+--------+----------+---------------------+---------------------+-------+
//                |    Scope     | Class  | Package  | Subclass(same pkg)  | Subclass(diff pkg)  | World |
//                +--------------+--------+----------+---------------------+---------------------+-------+
//                | public       |   X    |     X    |          X          |          X          |   X   |
//                | protected    |   X    |     X    |          X          |          X          |       |
//                | no modifier  |   X    |     X    |          X          |                     |       |
//                | private      |   X    |          |                     |                     |       |
//                +--------------+--------+----------+---------------------+---------------------+-------+
//                      ** Subclass(same pkg) : same package refers to a regular subclass
//                      ** Subclass(diff pkg) : different package refers to a subclass that EXTENDS THE ORIGINAL CLASS 
//                              but IS NOT DIRECT SUBCLASS
//
//
//              Block Scope ~ Blocks of code between '{' & '}'
//                  ** '{ }' Blocks DO NOT HAVE TO BE AFTER FUNCTION! Can be used anywhere which is REALLY COOL
//                  ** ACTUALLY SUCH A COOL STYLISTIC THING TOO!! 
                    {int x = 10; System.out.println(x);}
//                  | x = 5; -> DOES NOT WORK BECAUSE 'x' IS NOT DEFIEND OUTSIDE OF '{ }'

                    {int x = 5; System.out.println(x);}
                    int x = 10; System.out.println(x); 
    }
//----------------------------------------------------------------------------------------------------------------------------------

// Methods & All That Good Stuff
//----------------------------------------------------------------------------------------------------------------------------------
    private static void Methods(){
//      SCOPE STATIC? RETURN_TYPE FUNCTION_NAME ( PARAM_TYPE PARAM_NAME, ...){ ... }

        // STATIC : 
        //      Determines whether the method BELONGS to MAIN CLASS and NOT OBJECT OF MAIN CLASS. Basically
        //      it dictates whether the method can be accessed with/without creating an object of the class first. 
        //      ** Can be present or ommitted: 
        //       | private static void ... -> STATIC      -> NO NEED TO CREATE ISNTANCE OF OBJ 
        //       | private void ...        -> NOT STATIC  -> MUST CREATE INSTANCE OF OBJ

        // RETURN_TYPE : 
        //      Determines what type of variable is returned at the end of a function. It can either be
        //      'void' to indicate nothing is returned OR a type such as 'String', 'int', 'double'. 
        //      | return VAR_OF_TYPE_RETURN_TYPE
      
        // FUNCTION_NAME : 
        //      Just the name of the function that is going to be used to call it. 

        // PARAM_TYPE, PARAM_NAME
        //      PARAM_TYPE refers to the type of parameter that is passed
        //      PARAM_NAME following PARAM_TYPE refers to how the variable will used in the method
        // 
        //      Can also have multiple parameters:
        //      | private static void someMethod(String someString, int someInt, boolean someBool)
        //
        //      ** String args[] -> This is the default parameter used in 'main' functions. This is
        //      because in the terminal window, you can run a file with a list of parameters/words
        //      and String args[] can hold as many parameters as are given. To access them we do the
        //      same thing we would do with any list, by just indexing like so: 'args[1]'


        // **METHOD OVERLOADING : 
        //      In java Methods can have THE SAME EXACT NAME, and are only DIFFERENTIATED BY 
        //      THE PARAMETERS THEY HAVE.
        //
        //      | private void myMethod(int x, int y){ ... }
        //      | private void myMethod(int x, int y, int z){ ... }
        //      | private void myMethod(String x, String y){ ... } 
        //
        //      BOTH WORK and it will use whichever one matches the parameters. You could technically make 
        //      an infinite amount of functions with the same name as long as their parameters are slightly different.
    }
//----------------------------------------------------------------------------------------------------------------------------------
 

// Recursion & All That Messy Stuff
//----------------------------------------------------------------------------------------------------------------------------------
    private static int Recursion(int start, int end){
        // COVER RECURSION LATER WHEN YOU HAVE SOME COOL EXAMPLES AND PRACTICED WITH IT A BIT MORE.
        // SAME SHIT AS EVERY OTHER LANGUAGE, ITS ALL THEORY TECHNICALLY! 
        //      Basically making a problem smaller and smaller on every rotation of the method. 



        // Adding all numbers between int start, int end

        
        if( end > start){ 
            System.out.println(end);
            return end + Recursion(start, end-1);
        }
        else{return end;}

    }
//----------------------------------------------------------------------------------------------------------------------------------



    public static void main(String args[]){
        //Scope();
        //Methods();
        System.out.println(
            Recursion(1,10) );



    }
}
//##################################################################################################################################     
//################################################################################################################################## 