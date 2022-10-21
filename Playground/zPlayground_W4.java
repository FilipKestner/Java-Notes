
import java.util.Scanner;
public class zPlayground_W4 {

    static void summation(){

        Scanner kb = new Scanner(System.in);

        int totSum = 0; 
        int nextAdd;
        while(true){
            nextAdd = kb.nextInt();
            if(nextAdd == 0){break;}
            totSum += nextAdd;
        }
        System.out.println(totSum);
        

    }


    static void inBetween(){

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number (0-100):");
        int num1 = kb.nextInt();

        System.out.print("Enter a number (0-100):");
        int num2 = kb.nextInt();

        System.out.print("Enter a number (0-100):");
        int num3 = kb.nextInt();

        if( (num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3) ){System.out.println(num1 + " is the middle number");}
        else if((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3) ){System.out.println(num2 + " is the middle number");}
        else{System.out.println(num3 + " is the middle number");}

    }

    static void encode(){
        Scanner kb = new Scanner(System.in);


        System.out.print("Enter a phrase and we will encrypt it: ");

        String somePhrase = kb.nextLine();
        somePhrase = somePhrase.toUpperCase();

        System.out.println(somePhrase);
        System.out.println((byte)somePhrase.charAt(0));        
    }




    public static void main(String args[]){
        //summation();
        //inBetween();
        encode(); 


    }
    
}
