//   _____       _               _ _                                              
//  |_   _|     | |             (_) |                                             
//    | |  _ __ | |__   ___ _ __ _| |_ __ _ _ __   ___ ___                        
//    | | | '_ \| '_ \ / _ \ '__| | __/ _` | '_ \ / __/ _ \                       
//   _| |_| | | | | | |  __/ |  | | || (_| | | | | (_|  __/                       
//  |_____|_| |_|_| |_|\___|_|  |_|\__\__,_|_| |_|\___\___| _     _               
//    ___    |  __ \    | |                                | |   (_)              
//   ( _ )   | |__) |__ | |_   _ _ __ ___   ___  _ __ _ __ | |__  _ ___ _ __ ___  
//   / _ \/\ |  ___/ _ \| | | | | '_ ` _ \ / _ \| '__| '_ \| '_ \| / __| '_ ` _ \ 
//  | (_>  < | |  | (_) | | |_| | | | | | | (_) | |  | |_) | | | | \__ \ | | | | |
//   \___/\/ |_|   \___/|_|\__, |_| |_| |_|\___/|_|  | .__/|_| |_|_|___/_| |_| |_|
//                          __/ |                    | |                          
//                         |___/                     |_|                          
//####################################################################################################################################################    
//#################################################################################################################################################### 
// 
package P6_Inheritance_Polymorphism; 
public class Inheritance_Polymorphism {


    private static void codeExample(){
    //   Code Structure of Inehritance
    //   ________________________________________________________________________
    //  | public class MAIN_CLASS {                                              |
    //  |                                                                        |   
    //  |                                                                        |  
    //  |   private static void SOME_FUNCTION_NAME(PARAM_TYPE PARAM NAME, ...){  |
    //  |                                                                        |
    //  |          class innerClass{                                             |
    //  |                 int z = 1;                                             |
    //  |                                                                        |
    //  |          }                                                             |
    //  |                                                                        |
    //  | }                                                                      |
    //  |                                                                        | 
    //  .                                                                        .
    //  .                                                                        .
    //  .                                                                        .
    //  |                                                                        |
    //  | public class OTHER_CLASS extends MAIN_CLASS {                          | -> 'extends' keyword used to create an
    //  |                                                                        |    inheritance relationship 
    //  | }                                                                      | 
    //  .                                                                        .
    //  .                                                                        .
    //  .                                                                        .
    //  |                                                                        |  
    //  |                                                                        |  
    //  | public static void Main(String args[]){                                |  
    //  |       MAIN_CLASS someVar1 = new MAIN_CLASS();                          |
    //  |       OTHER_CLASS someVar2 = new OTHER_CLASS();                        |  
    //  |                                                                        |
    //  |       someVar2.SOME_FUNCTION_NAME();                                   | -> Can call methods from the original    
    //  |                                                                        |    class that the sublcass exetnds from. 
    //  | }                                                                      |  
    //  |                                                                        |    
    //  |________________________________________________________________________|   
    }    

    private static void inheritanceDetails(){
        // What is Ineherited? 
        //      ~ Attributes
        //      ~ Methods

        // ** You can also overrite inherited methods to do something different
        // than the main class from which we inherited a method of the same name. 
        // Basically OVERLOADING EXACT SAME METHOD. -> Polymorphism
    }

    private static void innerClasses(){
        // ** Inner classes are classes within classes. They can be used to group related objects/classes.
        // A good example of this is a player character that can shoot. Everytime he shoots he creates 
        // bullet objects which are created by the player object. 

        // ** You can declare inner classes as 'private' or 'protected' to ensure that
        // outside objects cannot access them. For the bullet example, we could make them
        // private and have the bullet object destroy themselves on contact. 

        // Making an object of an inner class: 
        Testing_Class_Main testingClass = new Testing_Class_Main(); 
        Testing_Class_Main.Inner_Class testingInnerClass = testingClass.new Inner_Class();
    }





    public static void main(String args[]){
        //codeExample();
        //inheritanceDetails();
        innerClasses(); 



    }




}
//
//####################################################################################################################################################    
//#################################################################################################################################################### 
