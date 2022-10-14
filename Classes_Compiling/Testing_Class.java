public class Testing_Class {
    int x = 0;
    final int y = 21; // Can never be changed

    // Overloaded Constructors
    //-----------------------------------
    public Testing_Class(){
    }

    public Testing_Class(int someNum){
        x = someNum;
    }
    //-----------------------------------

    public void printSomeStuff(){
        System.out.println("I am an object and this feels degrading");
    }

    static void iAmStatic(){
        System.out.println("Because I am a static method you can call me without making an instance of me");
    }
    
}
