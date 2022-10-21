//    _____ _                             _____       _               _ _                                
//   / ____| |                           |_   _|     | |             (_) |                               
//  | |    | | __ _ ___ ___  ___  ___      | |  _ __ | |__   ___ _ __ _| |_ __ _ _ __   ___ ___          
//  | |    | |/ _` / __/ __|/ _ \/ __|     | | | '_ \| '_ \ / _ \ '__| | __/ _` | '_ \ / __/ _ \         
//  | |____| | (_| \__ \__ \  __/\__ \_   _| |_| | | | | | |  __/ |  | | || (_| | | | | (_|  __/         
//   \_____|_|\__,_|___/___/\___||___( ) |_____|_| |_|_| |_|\___|_|  |_|\__\__,_|_| |_|\___\___|         
//             _____                 |/   _ _ _                 _______                   _              
//    ___     / ____|                    (_) (_)               / /  __ \                 (_)             
//   ( _ )   | |     ___  _ __ ___  _ __  _| |_ _ __   __ _   / /| |__) |   _ _ __  _ __  _ _ __   __ _  
//   / _ \/\ | |    / _ \| '_ ` _ \| '_ \| | | | '_ \ / _` | / / |  _  / | | | '_ \| '_ \| | '_ \ / _` | 
//  | (_>  < | |___| (_) | | | | | | |_) | | | | | | | (_| |/ /  | | \ \ |_| | | | | | | | | | | | (_| | 
//   \___/\/  \_____\___/|_| |_| |_| .__/|_|_|_|_| |_|\__, /_/   |_|  \_\__,_|_| |_|_| |_|_|_| |_|\__, | 
//                                 | |                 __/ |                                       __/ | 
//                                 |_|                |___/                                       |___/  
//####################################################################################################################################################    
//#################################################################################################################################################### 
//          

import java.lang.ref.*;

public class Classes_Compiling_Running_Projects {

// OOP Explained
//----------------------------------------------------------------------------------------------------------------------------------
    private static void ObjectOrientedProgramming_Explained(){
    // Class ~ A class is a template and/or framework for objects to be made from.
    //         Each class acts sort of like a mold to be filled by Objects.
    //
    // Object ~ An object is an individial instance OF A CLASS. So every object
    //          inherits all the properties of it's parent class but is its own
    //          version of it.

    //           ________________________________________________________________________
    //          | public class CLASS_NAME {                                              |
    //          |       int x = 5; -> THIS IS AN ATTRIBUTE                               |
    //          |                                                                        |
    //          |       public CLASS_NAME {                                              | -> Constructor Method ~ Used to initialize the object
    //          |                                                                        |    whenever its instantiated. ** Remember you can 
    //          |                                                                        |    overload it too!
    //          |       }                                                                |
    //          |                                                                        |
    //          |                                                                        |
    //          |                                                                        |
    //          .                                                                        .
    //          .                                                                        .
    //          .                                                                        .
    //          |                                                                        |
    //          |       static void someMethod1(){                                       | -> Static ~ NO NEED TO INSTANTIATE
    //          |               ...                                                      |
    //          |               ...                                                      |
    //          |               ...                                                      |
    //          | }                                                                      |
    //          |       public void someMethod1(){                                       | -> Public ~ NEED TO INSTANTIATE
    //          |               ...                                                      |
    //          |               ...                                                      |
    //          |               ...                                                      |
    //          | }                                                                      |
    //          |________________________________________________________________________|   
    }  

//----------------------------------------------------------------------------------------------------------------------------------

// How To Compile a Project:
//----------------------------------------------------------------------------------------------------------------------------------
    private static void CompilingAProject(){
    //  1: GO TO DIRECTORY OF .java FILES
    //      | C:\Users\YOUR_NAME\Desktop\Java Notes
    //  2: COMPILE
    //      | javac FILE_NAME.java
    //  3: RUN
    //      | java FILE_NAME.class

    // ************************************************************
    // ** In order to use classes across multiple files YOU MUST **
    // ** COMPILE ALL FILES THAT ARE USED/IMPORTED!!!            **
    // ************************************************************
    }
//----------------------------------------------------------------------------------------------------------------------------------


// General Class Info
//----------------------------------------------------------------------------------------------------------------------------------
    private static void Classes(){
        // Object Creation (from a Class)
        //  | CLASS_NAME varName = new CLASS_NAME();
        Testing_Class someClass1 = new Testing_Class();
        Testing_Class someClass2 = new Testing_Class();

        // Object Attribute Access & Manipulation:
        int x = someClass1.x; // -> RETRIEVE an attribute
        someClass2.x = 21;    // -> MUTATE an attribute
        // ** To prevent attributes from being modified you should
        // declare them using keyword 'final'
        //      | final int x = 10;

        // Calling Object Methods:
        someClass1.printSomeStuff();
        // | Testing_Class.printSomeStuff() -> DOES NOT WORK BECAUSE NOT STATIC

        // ** Static methods can be called with OR WITHOUT instantiating an object. 
        // This can come in handy if you want to have a default output for a function
        // but be able to modify it via the object properties for different outcomes. 
        Testing_Class.iAmStatic(); 
        someClass2.iAmStatic(); 


        // CONSTRUCTORS:
        // **************************************************************************************
        //      A constructor method looks as follows:
        //          | public CLASS_NAME( PARAM_TYPE PARAM_NAME, ... ) { ... }
        //      It is used upon creation i.e. when you use 'new CLASS_NAME()'.
        //      It can also be overloaded so you can make an object differently
        //      based on which parameters you choose to pass. 
        //      Check Testing_Class.java for clear example. 
                Testing_Class someClass3 = new Testing_Class(); // -> No param
                Testing_Class someClass4 = new Testing_Class(4); // -> A param
                // BOTH WORK
        
        // **************************************************************************************



        // Encapsulation:
        //  -> The process of hiding sensitive data from the user and 
        //     using 'getter' and 'setter' methods instead

        // GETTER:
        //      public int getx(){
        //          return x; 
        //      }
    
        // SETTER:
        //      public void setx(int z){
        //          x = z; 
        //      }

    }
//----------------------------------------------------------------------------------------------------------------------------------

// Referencing Objects & Garbage Collection
//----------------------------------------------------------------------------------------------------------------------------------
    private static void referencing(){
        // A REFERENCE is essentially how a variable is attached to it's data when
        // it is initalized and/or assigned a new value. Many different types of
        // references exist: STRONG, WEAK, SOFT, PHANTOM. These reference are 
        // most pertinant to Java garbage collection. 



        // Java Garbage Collection: 
        //      -> Garbage collection is going through all the memory that has 
        //         been occupied by a program and then clearing it to make it 
        //         available for us. If this fails or there is a bug that
        //         results in MEMORY OVERFLOW, the longer you run that program
        //         the more memory it will allocate and eventually you will 
        //         run out of memory. 

        //      ** Go deeper into documentation and watch videos to see
        //      what makes Java garbage collection unique?? 


        // Strong References:  
        //      ** Default type of reference for class objects
        Testing_Class strongRefObj = new Testing_Class(); 
        // ** Strong references are not available to the 
        // garbage collector UNTIL the original referenced
        // variable becomes null. 
        // 
        // | SOME_CLASS var_name = new SOME_CLASS();         -> Memory reserved
        // |                . . . 
        // | var_name = null;                                -> Memory marked for collection
        strongRefObj = null; 


        // Weak References: 
        //  Must Use the Following:
        //      | import java.lang.ref.WeakReference; 
        //      | import java.lang.ref.*;             => EVEN BETTER TO IMPORT ALL REFS
        //
        //      -> A WEAK reference is essentially always marked for 
        //         garbage collection. A good example of this is creating
        //         a DBConnection and after the application using it is 
        //         closed, the memory allocated is free for collection. 
        //  
        // | import java.lang.ref.WeakReference;
        // |            . . .     
        // | SOME_CLASS var_name1 = new SOME_CLASS();
        // |            . . . 
        // | WeakReference<SOME_CLASS> var_name2 = new WeakReference<SOME_CLASS>(var_name1);

        Testing_Class someObj = new Testing_Class();                                         // -> A strong connection
        WeakReference<Testing_Class> weakRefObj = new WeakReference<Testing_Class>(someObj); // -> A weak connection to the obj

        // TO actually use the object that has been weak referenced we must use '.get()'
        weakRefObj.get().printSomeStuff();


        someObj = null;             // -> MARK FOR GARBAGE COLLECTION
        someObj = weakRefObj.get(); // -> GET BACK THE STRONG REFERENCE
        someObj.printSomeStuff();   // -> We can now call the non-static function again

        // ** You can also dictate the LEVEL OF WEAKNESS IN A REFERENCE:


        //      Soft References: 
        //          -> When an object is set for garbage collection
        //             the JVM will avoid collecting that memory until
        //             IT IS IN DESPERATE NEED FOR IT! Basically it 
        //             becomes a last resort. 
        //      Must Use the Following:
        //          | import java.lang.ref.WeakReference; 
        //          | import java.lang.ref.*;             => EVEN BETTER TO IMPORT ALL REFS
                SoftReference<Testing_Class> softRefObj = new SoftReference<Testing_Class>(someObj);

                someObj = null;              // -> MARK FOR COLLECTION
                someObj = softRefObj.get();  // -> GET BACK THE STRONG REFERENCE
                someObj.printSomeStuff();    // -> We can now call the func again


        //      Phantom References:
        //          -> Before being removed from memory, the phantom reference
        //             puts the object in a REFERENCE QUE. VERY USEFUL
        //             for garbage collection right before death of process
        //              OR CHECKING IF A SPECIFIC OBJ HAS BEEN COLLECTED.

                ReferenceQueue<Testing_Class> refQ = new ReferenceQueue<Testing_Class>();
                PhantomReference<Testing_Class> phantRef = new PhantomReference<Testing_Class>(someObj, refQ);

                someObj = null;            // -> Set for collection
                someObj = phantRef.get();  // -> Kept in que so we can recover? 

               // someObj.printSomeStuff(); -> INVALID WHY??
                System.out.println(refQ.poll()); 
                System.out.println(refQ.poll());
    }
//----------------------------------------------------------------------------------------------------------------------------------





    public static void main(String args[]){
        //ObjectOrientedProgramming_Explained();
        //CompilingAProject();
        //Classes();
        referencing(); 
    }
     
}

//
//####################################################################################################################################################    
//#################################################################################################################################################### 