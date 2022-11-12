// ## Question 3: Movie

// In this questions you will create 2 classes: `Movie` and `Platform`.

// A `Runner` class is provided that runs the program and uses the above classes,
// but there is still some code you need to add to this class.
// Currently the code in `Runner` is commented  because it does not compile:
// the classes `Movie` and `Platform` still need to be written by you.

// 1. Create a class `Movie` with 
//     - attributes
//       - `title`: text
//       - `year`: integer
//       - attributes may not be accessible from outside the class
//     - a constructor that initialises all attributes
//     - methods
//       - a getter for `year`
//       - `toString` that returns a `String` with `name` (30 characters) and `year`.  
//       Example: `When Harry Met Sally          1989`

// 2. Create a class `Platform` with 
//     - attributes
//       - `CAPACITY`: integer constant with value 10
//       - `movies`:  array of `Movie` objects that is initialised with size `CAPACITY`
//       - `next`: integer that holds the index of the first free location in `movies`  
//         (this is equal to the number of elements in movies)
//       - attributes may not be accessible from outside the class
//     - methods
//         - `addMovie` with parameter `movie`: adds a movie to `movies` and adjusts `index`
//         - `getMovie` with parameter `index`: returns the `Movie` at location `index` in `movies` 
//         - `getNumberOfMovies`: returns number of actual (non-null) elements in `movies`
//         - `isFull` with return type `boolean`: returns whether or not there is room for an extra movie in `movies`

// 3. Uncomment the code in the `Runner` class. It creates a `Platform` and adds `Movie` objects to it. 
// If you created the classes and methods correctly then the code should contain no errors anymore.

// 4. From the `Runner` class you will now print some information.  
// Only use the methods created above to access information in `Movie` and `Platform`.  
//     1. Print every movie in the platform. 
//     2. Print the number of movies that are older than 1990
//     3. Print whether or not the platform has capacity for additional movies 

// ### Expected output

// ```
// Batman                        1989
// When Harry Met Sally          1989
// Dances With Wolves            1990
// Pretty Woman                  1990
// Total Recal                   1990
// Thelma & Louise               1991
// The Silence Of The Lambs      1991
// Reservoir Dogs                1992
// Jurassic Park                 1993
// Schindler's List              1993
// There are 2 movies from before 1990
// The platform has NO room for additional movies
// ```

// * Now change CAPACITY in platform to 20, and run again.

// ### Expected output

// ```
// Batman                        1989
// When Harry Met Sally          1989
// Dances With Wolves            1990
// Pretty Woman                  1990
// Total Recal                   1990
// Thelma & Louise               1991
// The Silence Of The Lambs      1991
// Reservoir Dogs                1992
// Jurassic Park                 1993
// Schindler's List              1993
// There are 2 movies from before the nineties.
// The platform has room available for additional movies.
// ```

package movies;

public class Runner {
    public static void main(String[] args) {
		Platform netFlix = new Platform();
		netFlix.addMovie(new Movie("Batman", 1989));
		netFlix.addMovie(new Movie("When Harry Met Sally", 1989));
		netFlix.addMovie(new Movie("Dances With Wolves", 1990));
		netFlix.addMovie(new Movie("Pretty Woman", 1990));
		netFlix.addMovie(new Movie("Total Recal", 1990));
		netFlix.addMovie(new Movie("Thelma & Louise", 1991));
		netFlix.addMovie(new Movie("The Silence Of The Lambs", 1991));
		netFlix.addMovie(new Movie("Reservoir Dogs", 1992));
		netFlix.addMovie(new Movie("Jurassic Park", 1993));
		netFlix.addMovie(new Movie("Schindler's List", 1993));


//   //TODO Print every movie on the NetFlix platform.

        for(int i = 0; i < netFlix.getNumberOfMovies();i++){
            System.out.println(netFlix.getMovie(i));

        }
//   //TODO Print the number of movies that are older than 1990

        int counter = 0;
        for(int i = 0; i < netFlix.getNumberOfMovies();i++){
            if(netFlix.getMovie(i).getYear() < 1990){
                counter++;
            }

        }

        System.out.println("There are " + counter + " movies before the nineties.");

//   //TODO Print if the Platform has capacity for additional movies
        if(netFlix.isFull()){System.out.println("The platform has rooms for additional movies");}
        else{System.out.println("The platform has room for additional movies");}


    }
}
