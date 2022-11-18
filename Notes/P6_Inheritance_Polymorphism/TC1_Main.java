package P6_Inheritance_Polymorphism;

public class TC1_Main {
    static int x = 1; 
    static int y; 


    TC1_Main(){
        y = 1;
    }

    TC1_Main(int someInt){
        x = someInt; 
    }

    TC1_Main(int someInt, int someInt2){
        x = someInt;
        y = someInt2; 

    }

    public int getX(){

        return x; 

    }

    public int getY(){
        return y; 
    }

    public int someFunc(){


        return x+y;
    }


    public class Inner_Class{
        private static void printer(){
            System.out.println("I AM AN INNER CLASS");
        }

        public static void Main(){
            printer();

        }


    }



}
