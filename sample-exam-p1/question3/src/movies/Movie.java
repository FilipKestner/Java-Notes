package movies;

public class Movie {

    private String title; 
    int year; 


    public Movie(){
        this.title = "";
        this.year = 0; 

    }

    public Movie(String name, int release){
        this.title = name;
        this.year = release; 
    }


    public int getYear(){
        return this.year; 
    }

    public String toString(){
        return String.format("%1$-30s%2$d",this.title,this.year);
    }
    
}
