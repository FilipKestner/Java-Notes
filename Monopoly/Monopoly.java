package Monopoly;
//-----------------------------
import java.util.ArrayList;

public class Monopoly {

    final int MAX_PLAYERS = 8;
    final int MIN_PLAYERS = 2;


  
    public class Player{
        String name; 

        int position; 
        
        ArrayList<Property> properties = new ArrayList<Property>();

        Pawn pawn; 

        Money money; 

    }

    public class Property{
        String name = "";
        Building building; 

        int position; 
    }

    public class Money{
        int value = 0; 
    }

    public class Dice{
        // Rand Int

        // GetNewValue() -> Double Roll
        int value; 

    }

  

    public class Pawn{
        int Position;
        String type; 


    }

    public class Cards{
        String type; 
        String action;
        int valuel; 

        int position; 

    }

    public class Building{
        String type;
        int amount; 

    }

    public class Board{
        int size = 40;

    }

    public class GameState{
        // Handles Score Storing and 
        // reinitiating future game states

    }

final static String board = 
"""
 _________________________________________________
|    |    |    |    |    |    |    |    |    |    |
|    |    |    |    |    |    |    |    |    |    |
|____|____|____|____|____|____|____|____|____|____|
|    |                                       |    |
|    |                                       |    |
|____|                                       |____|
|    |                                       |    |
|    |                                       |    |
|____|                                       |____|
|    |                                       |    |
|    |                                       |    |
|____|                                       |____|
|    |                                       |    |
|    |                                       |    |
|____|                                       |____|
|    |                                       |    |
|    |                                       |    |
|____|                                       |____|
|    |                                       |    |
|    |                                       |    |
|____|                                       |____|
|    |                                       |    |
|    |                                       |    |
|____|                                       |____|
|    |                                       |    |
|    |                                       |    |
|____|_______________________________________|____|
|    |    |    |    |    |    |    |    |    |    |
|    |    |    |    |    |    |    |    |    |    |
|____|____|____|____|____|____|____|____|____|____|



""";

    public static void main(String args[]){

        System.out.print(board);
        

    }
    
}
