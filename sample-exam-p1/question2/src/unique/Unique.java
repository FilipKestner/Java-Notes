package unique;

import java.util.Random;



// ## Question 2: Unique

// Write a program that generates an array named "original" with random numbers from 1 to 10.
// Then copy the values to an array named "unique" with the same numbers, but make sure each number is present in _unique_ only once. 
// If a certain number from _original_ would be copied over to _unique_ a second time, add a 0 instead.

// Both arrays are already present in the given `main` method.

// 1. fill the first array (original) with randomly chosen numbers from 1 to 10 (both inclusive)
// 2. copy the integers of _original_ to the second array _unique_, but replace doubles with a zero:  
//    Before adding a number to _unique_
//    1. set a boolean _found_ to `false`
//    2. iterate over the elements of _unique_ and set _found_ to `true` if the element is found in the array
//    3. if _found_ is `false` copy the number to _unique_, otherwise add a 0 to _unique_

// Code is present to print out both arrays.  
// For _original_ all numbers are printed.  
// For _unique_ all numbers **except the zeroes** are printed.

// ### Example
// ```
// Original: 7 8 1 10 4 10 9 5 2 5 3 6 1 6 8 
// Unique  : 7 8 1 10 4 9 5 2 3 6 
// ```


public class Unique {
	public static void main(String[] args) {
		final int SIZE=15; // length of arrays
		final int MAX=10; //highest number to generate
		int[] original = new int[SIZE];
		int[] unique=new int[SIZE];
		// TODO
		// ------------------------------------------------------


		// Generate & Fill 'original[]'
		java.util.Random gen = new java.util.Random(); 
		for(int i = 0; i < SIZE; i++){
			original[i] = gen.nextInt(MAX)+1; 
		}



		boolean _found_ = false; 

		for(int i = 0; i < SIZE; i++){

			// Checking for Duplicate
			for( int x = 0; x < unique.length; x++){
				if(original[i] == unique[x]){_found_ = true; 
					break;}
			}

			// Copy value to unique
			if(_found_ == true){unique[i] = 0;}
			else{unique[i] = original[i];}

			_found_ = false;
		}




		// ------------------------------------------------------
		System.out.print("Original: ");
		for (int i:original) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Unique  : ");
		for (int i:unique) {
			if (i != 0) System.out.print(i + " ");
		}
	}

}
