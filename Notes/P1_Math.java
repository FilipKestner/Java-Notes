//       ______  __       _   _         
//      / / /  \/  |     | | | |        
//     / / /| \  / | __ _| |_| |__      
//    / / / | |\/| |/ _` | __| '_ \     
//   / / /  | |  | | (_| | |_| | | |    
//  /_/_/   |_|  |_|\__,_|\__|_| |_|    
//   ______ ______ ______ ______ ______ 
//  |______|______|______|______|______|
//
//##################################################################################################################################     
//##################################################################################################################################                                       
                                     
// ** MUST INCLUDE THIS                             
import java.lang.Math;                                     


public class P1_Math {

    private static void Random(){

        
        // Using MATH to Generate Random: 
        // ** Don't use this if you need create continues random numbers
        // with a UNIFORM distribution. 
        // Math.random() -> Returns a "random" number between 0->1 
        // (Math.random() * RANGE) + MINIMUM


        // 1: Create a Random Number Generator: 
        // java.util.Random GENERATOR_NAME = new java.util.Random():
        java.util.Random gen = new java.util.Random(); 
        

        // 2: Use the GENERATOR VARIABLE to create a random seed
        // GENERATOR_NAME.nextInt( (int)[BOUND] )  -> Generates a random number in range (0->BOUND)
        // GENERATOR_NAME.nextBoolean()            -> Generates a true/false on an even distribution
        double x = gen.nextInt(5)+1;
        System.out.println(x);


        // Basic Use Example: 
        final int UPPER = 6;
        final int LOWER = 1; 

        while(x < UPPER){
            x = gen.nextInt(UPPER)+1;
            System.out.println(x);
        }


        //System.out.println(gen.nextBoolean());
        


    }



// Math Method Reference
//  -------------------------
//  Math.METHOD(SOME_PARAM);
//  import java.lang.Math;
//  -------------------------
//  ** ALL METHODS ARE STATIC

//  METHOD              |                                         DESCRIPTION                                                               | RETURN TYPE                
// *********************************************************************************************************************************************************************
//  abs(x) 	            | Returns the absolute value of x 	                                                                                | double|float|int|long
//  acos(x) 	        | Returns the arccosine of x, in radians 	                                                                        | double
//  asin(x) 	        | Returns the arcsine of x, in radians 	                                                                            | double
//  atan(x) 	        | Returns the arctangent of x as a numeric value between -PI/2 and PI/2 radians 	                                | double
//  atan2(y,x) 	        | Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta). 	| double
//  cbrt(x) 	        | Returns the cube root of x 	                                                                                    | double
//  ceil(x) 	        | Returns the value of x rounded up to its nearest integer 	                                                        | double
//  copySign(x, y) 	    | Returns the first floating point x with the sign of the second floating point y 	                                | double
//  cos(x) 	            | Returns the cosine of x (x is in radians) 	                                                                    | double
//  cosh(x) 	        | Returns the hyperbolic cosine of a double value 	                                                                | double
//  exp(x) 	            | Returns the value of Ex 	                                                                                        | double
//  expm1(x) 	        | Returns ex -1 	                                                                                                | double
//  floor(x) 	        | Returns the value of x rounded down to its nearest integer 	                                                    | double
//  getExponent(x) 	    | Returns the unbiased exponent used in x 	                                                                        | int
//  hypot(x, y) 	    | Returns sqrt(x2 +y2) without intermediate overflow or underflow 	                                                | double
//  IEEEremainder(x, y) | Computes the remainder operation on x and y as prescribed by the IEEE 754 standard 	                            | double
//  log(x) 	            | Returns the natural logarithm (base E) of x 	                                                                    | double
//  log10(x) 	        | Returns the base 10 logarithm of x 	                                                                            | double
//  log1p(x) 	        | Returns the natural logarithm (base E) of the sum of x and 1 	                                                    | double
//  max(x, y) 	        | Returns the number with the highest value 	                                                                    | double|float|int|long
//  min(x, y) 	        | Returns the number with the lowest value 	                                                                        | double|float|int|long
//  nextAfter(x, y) 	| Returns the floating point number adjacent to x in the direction of y 	                                        | double|float
//  nextUp(x) 	        | Returns the floating point value adjacent to x in the direction of positive infinity 	                            | double|float
//  pow(x, y) 	        | Returns the value of x to the power of y 	                                                                        | double
//  random() 	        | Returns a random number between 0 and 1 	                                                                        | double
//  round(x) 	        | Returns the value of x rounded to its nearest integer 	                                                        | int
//  rint(x) 	        | Returns the double value that is closest to x and equal to a mathematical integer 	                            | double
//  signum(x) 	        | Returns the sign of x 	                                                                                        | double
//  sin(x) 	            | Returns the sine of x (x is in radians) 	                                                                        | double
//  sinh(x) 	        | Returns the hyperbolic sine of a double value 	                                                                | double
//  sqrt(x) 	        | Returns the square root of x 	                                                                                    | double
//  tan(x) 	            | Returns the tangent of an angle 	                                                                                | double
//  tanh(x) 	        | Returns the hyperbolic tangent of a double value 	                                                                | double
//  toDegrees(x) 	    | Converts an angle measured in radians to an approx. equivalent angle measured in degrees 	                        | double
//  toRadians(x) 	    | Converts an angle measured in degrees to an approx. angle measured in radians 	                                | double
//  ulp(x) 	            | Returns the size of the unit of least precision (ulp) of x 	                                                    | double|float
// *********************************************************************************************************************************************************************

    public static void main(String args[]){
        Random();


    }

    
}
