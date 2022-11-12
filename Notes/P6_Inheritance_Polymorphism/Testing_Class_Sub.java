package P6_Inheritance_Polymorphism;

public class Testing_Class_Sub extends Testing_Class_Main {
    



    @Override
    public int getY(){
        return y+1; 
    }

    @Override
    public int getX(){
        return x+1; 
    }

    @Override 
    public int someFunc(){

        return x*y; 
    }
}
