# Example Exam Programming 1.1

TODO. General instructions:
- questions can be worked on in any order
- **what are students allowed to use**???
- Exam tool
- At the end: zip the entire project and upload it

## Question 1
Write a program that
1. ask the user for a sentence.
2. counts the number of vowels (aeiouy) in the sentence
3. prints the result to the screen

You must use the switch statement in your program.

### Example
```
Please enter a sentence: Goodbye and thanks for all the fish!
The sentence contains 9 vowels
```

## Question 2: Unique

Write a program that generates an array named "original" with random numbers from 1 to 10.
Then copy the values to an array named "unique" with the same numbers, but make sure each number is present in _unique_ only once. 
If a certain number from _original_ would be copied over to _unique_ a second time, add a 0 instead.

Both arrays are already present in the given `main` method.

1. fill the first array (original) with randomly chosen numbers from 1 to 10 (both inclusive)
2. copy the integers of _original_ to the second array _unique_, but replace doubles with a zero:  
   Before adding a number to _unique_
   1. set a boolean _found_ to `false`
   2. iterate over the elements of _unique_ and set _found_ to `true` if the element is found in the array
   3. if _found_ is `false` copy the number to _unique_, otherwise add a 0 to _unique_

Code is present to print out both arrays.  
For _original_ all numbers are printed.  
For _unique_ all numbers **except the zeroes** are printed.

### Example
```
Original: 7 8 1 10 4 10 9 5 2 5 3 6 1 6 8 
Unique  : 7 8 1 10 4 9 5 2 3 6 
```

## Question 3: Movie

In this questions you will create 2 classes: `Movie` and `Platform`.

A `Runner` class is provided that runs the program and uses the above classes,
but there is still some code you need to add to this class.
Currently the code in `Runner` is commented  because it does not compile:
the classes `Movie` and `Platform` still need to be written by you.

1. Create a class `Movie` with 
    - attributes
      - `title`: text
      - `year`: integer
      - attributes may not be accessible from outside the class
    - a constructor that initialises all attributes
    - methods
      - a getter for `year`
      - `toString` that returns a `String` with `name` (30 characters) and `year`.  
      Example: `When Harry Met Sally          1989`

2. Create a class `Platform` with 
    - attributes
      - `CAPACITY`: integer constant with value 10
      - `movies`:  array of `Movie` objects that is initialised with size `CAPACITY`
      - `next`: integer that holds the index of the first free location in `movies`  
        (this is equal to the number of elements in movies)
      - attributes may not be accessible from outside the class
    - methods
        - `addMovie` with parameter `movie`: adds a movie to `movies` and adjusts `index`
        - `getMovie` with parameter `index`: returns the `Movie` at location `index` in `movies` 
        - `getNumberOfMovies`: returns number of actual (non-null) elements in `movies`
        - `isFull` with return type `boolean`: returns whether or not there is room for an extra movie in `movies`

3. Uncomment the code in the `Runner` class. It creates a `Platform` and adds `Movie` objects to it. 
If you created the classes and methods correctly then the code should contain no errors anymore.

4. From the `Runner` class you will now print some information.  
Only use the methods created above to access information in `Movie` and `Platform`.  
    1. Print every movie in the platform. 
    2. Print the number of movies that are older than 1990
    3. Print whether or not the platform has capacity for additional movies 

### Expected output

```
Batman                        1989
When Harry Met Sally          1989
Dances With Wolves            1990
Pretty Woman                  1990
Total Recal                   1990
Thelma & Louise               1991
The Silence Of The Lambs      1991
Reservoir Dogs                1992
Jurassic Park                 1993
Schindler's List              1993
There are 2 movies from before 1990
The platform has NO room for additional movies
```

* Now change CAPACITY in platform to 20, and run again.

### Expected output

```
Batman                        1989
When Harry Met Sally          1989
Dances With Wolves            1990
Pretty Woman                  1990
Total Recal                   1990
Thelma & Louise               1991
The Silence Of The Lambs      1991
Reservoir Dogs                1992
Jurassic Park                 1993
Schindler's List              1993
There are 2 movies from before the nineties.
The platform has room available for additional movies.
```
