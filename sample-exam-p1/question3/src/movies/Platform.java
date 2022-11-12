package movies;

public class Platform {

    private final int CAPACITY = 10;
    private Movie[] movies = new Movie[CAPACITY];
    private int next = 0; 


    public void addMovie(Movie movie){
        movies[next] = movie;
        next++; 
    }

    public Movie getMovie(int index){

        return this.movies[index];
    }

    public int getNumberOfMovies(){
        return this.next;
    }

    public boolean isFull(){
        if(this.next == CAPACITY){return true;}
        else{return false;}
    }
}
