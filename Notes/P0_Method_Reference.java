public class P0_Method_Reference {

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



// String Method Reference

//  METHOD               |                                         DESCRIPTION                                                                  | RETURN TYPE                
// *********************************************************************************************************************************************************************
// charAt() 	         | Returns the character at the specified index (position) 	                                                            | char
// codePointAt() 	     | Returns the Unicode of the character at the specified index 	                                                        | int
// codePointBefore() 	 | Returns the Unicode of the character before the specified index                                               	    | int
// codePointCount() 	 | Returns the number of Unicode values found in a string. 	                                                            | int
// compareTo() 	         | Compares two strings lexicographically 	                                                                            | int
// compareToIgnoreCase() | Compares two strings lexicographically, ignoring case differences 	                                                | int
// concat() 	         | Appends a string to the end of another string 	                                                                    | String
// contains() 	         | Checks whether a string contains a sequence of characters 	                                                        | boolean
// contentEquals() 	     | Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer | boolean
// copyValueOf() 	     | Returns a String that represents the characters of the character array 	                                            | String
// endsWith() 	         | Checks whether a string ends with the specified character(s) 	                                                    | boolean
// equals() 	         | Compares two strings. Returns true if the strings are equal, and false if not 	                                    | boolean
// equalsIgnoreCase() 	 | Compares two strings, ignoring case considerations 	                                                                | boolean
// format() 	         | Returns a formatted string using the specified locale, format string, and arguments 	                                | String
// getBytes() 	         | Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array 	    | byte[]
// getChars() 	         | Copies characters from a string to an array of chars 	                                                            | void
// hashCode() 	         | Returns the hash code of a string 	                                                                                | int
// indexOf() 	         | Returns the position of the first found occurrence of specified characters in a string 	                            | int
// intern() 	         | Returns the canonical representation for the string object 	                                                        | String
// isEmpty() 	         | Checks whether a string is empty or not 	                                                                            | boolean
// lastIndexOf() 	     | Returns the position of the last found occurrence of specified characters in a string 	                            | int
// length() 	         | Returns the length of a specified string 	                                                                        | int
// matches() 	         | Searches a string for a match against a regular expression, and returns the matches 	                                | boolean
// offsetByCodePoints()  | Returns the index within this String that is offset from the given index by codePointOffset code points 	            | int
// regionMatches() 	     | Tests if two string regions are equal 	                                                                            | boolean
// replace() 	         | Searches a string for a specified value, and returns a new string where the specified values are replaced 	        | String
// replaceFirst() 	     | Replaces the first occurrence of a substring that matches the given regular expression with the given replacement 	| String
// replaceAll() 	     | Replaces each substring of this string that matches the given regular expression with the given replacement 	        | String
// split() 	             | Splits a string into an array of substrings 	                                                                        | String[]
// startsWith() 	     | Checks whether a string starts with specified characters 	                                                        | boolean
// subSequence() 	     | Returns a new character sequence that is a subsequence of this sequence 	                                            | CharSequence
// substring() 	         | Returns a new string which is the substring of a specified string 	                                                | String
// toCharArray() 	     | Converts this string to a new character array 	                                                                    | char[]
// toLowerCase() 	     | Converts a string to lower case letters 	                                                                            | String
// toString() 	         | Returns the value of a String object 	                                                                            | String
// toUpperCase() 	     | Converts a string to upper case letters 	                                                                            | String
// trim() 	             | Removes whitespace from both ends of a string 	                                                                    | String
// valueOf() 	         | Returns the string representation of the specified value 	                                                        | String
// *********************************************************************************************************************************************************************



// ARRAY METHODS
// .------------------------------------------------------------------------.--------------------------------------------------------------------------------------------------------------------------------------------------.
// |                                Methods                                 |                                                                 Action Performed                                                                 |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | asList()                                                               | Returns a fixed-size list backed by the specified Arrays                                                                                         |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | binarySearch()                                                         | Searches for the specified element in the array with the help of the Binary Search Algorithm                                                     |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | binarySearch(array, fromIndex, toIndex, key, Comparator)               | Searches a range of the specified array for the specified object using the Binary Search Algorithm                                               |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | compare(array 1, array 2)                                              | Compares two arrays passed as parameters lexicographically.                                                                                      |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | copyOf(originalArray, newLength)                                       | Copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.                    |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | copyOfRange(originalArray, fromIndex, endIndex)                        | Copies the specified range of the specified array into a new Arrays.                                                                             |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | deepEquals(Object[] a1, Object[] a2)                                   | Returns true if the two specified arrays are deeply equal to one another.                                                                        |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | deepHashCode(Object[] a)                                               | Returns a hash code based on the “deep contents” of the specified Arrays.                                                                        |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | deepToString(Object[] a)                                               | Returns a string representation of the “deep contents” of the specified Arrays.                                                                  |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | equals(array1, array2)                                                 | Checks if both the arrays are equal or not.                                                                                                      |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | fill(originalArray, fillValue)                                         | Assigns this fill value to each index of this arrays.                                                                                            |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | hashCode(originalArray)                                                | Returns an integer hashCode of this array instance.                                                                                              |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | mismatch(array1, array2)                                               | Finds and returns the index of the first unmatched element between the two specified arrays.                                                     |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | parallelPrefix(originalArray, fromIndex, endIndex, functionalOperator) | Performs parallelPrefix for the given range of the array with the specified functional operator.                                                 |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | parallelPrefix(originalArray, operator)                                | Performs parallelPrefix for complete array with the specified functional operator.                                                               |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | parallelSetAll(originalArray, functionalGenerator)                     | Sets all the elements of this array in parallel, using the provided generator function.                                                          |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | parallelSort(originalArray)                                            | Sorts the specified array using parallel sort.                                                                                                   |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | setAll(originalArray, functionalGenerator)                             | Sets all the elements of the specified array using the generator function provided.                                                              |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | sort(originalArray)                                                    | Sorts the complete array in ascending order.                                                                                                     |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | sort(originalArray, fromIndex, endIndex)                               | Sorts the specified range of array in ascending order.                                                                                           |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | sort(T[] a, int fromIndex, int toIndex, Comparator< super T> c)        | Sorts the specified range of the specified array of objects according to the order induced by the specified comparator.                          |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | sort(T[] a, Comparator< super T> c)                                    | Sorts the specified array of objects according to the order induced by the specified comparator.                                                 |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | spliterator(originalArray)                                             | Returns a Spliterator covering all of the specified Arrays.                                                                                      |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | spliterator(originalArray, fromIndex, endIndex)                        | Returns a Spliterator of the type of the array covering the specified range of the specified arrays.                                             |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | stream(originalArray)                                                  | Returns a sequential stream with the specified array as its source.                                                                              |
// :------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------:
// | toString(originalArray)                                                | It returns a string representation of the contents of this array. The string representation consists of a                                        |
// |                                                                        | list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters a comma followed by a space. |
// |                                                                        | Elements are converted to strings as by String.valueOf() function.                                                                               |
// '------------------------------------------------------------------------'--------------------------------------------------------------------------------------------------------------------------------------------------'






    public static void main (String args[]){


    }
    
}

//####################################################################################################################################################    
//#################################################################################################################################################### 