package Inheritance_Polymorphism;

public class Testing_Class_Main {
    static int x = 1; 
    static int y; 


    Testing_Class_Main(){
        y = 1;
    }

    Testing_Class_Main(int someInt){
        x = someInt; 
    }

    Testing_Class_Main(int someInt, int someInt2){
        x = someInt;
        y = someInt2; 

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
