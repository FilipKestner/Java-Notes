import java.util.Scanner;


public class zPlayground_W5 {


        private static void f8(){




        
            
        }



        private static void palindrome(){
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter a word: ");

            StringBuilder word = new StringBuilder(keyboard.nextLine());

            StringBuilder reverse = new StringBuilder(word.toString());
            reverse.reverse();


            //System.out.println(word);
            //System.out.println(reverse);

            for(int i = 0; i < (word.length()/2); i++){
                if (word.charAt(i) != reverse.charAt(i)){
                    System.out.println("NOT A PALINDROME");
                    return;
                }


            }

            System.out.println("IS A PALINDROME");

        }

        private static void count(){

            final int LOWER_BOUND = 1;
            final int UPPER_BOUND = 20;
            final int STRING_BUILDER_CAP = 100;
            String qString = "Enter a number between " + LOWER_BOUND + " and " + UPPER_BOUND + " to count to: ";

            Scanner keyboard = new Scanner(System.in);

            System.out.print(qString);

            StringBuilder printString = new StringBuilder(STRING_BUILDER_CAP);


            int num_to_count = 0; 
            while(true){

                num_to_count = keyboard.nextInt(); 

                if(num_to_count == 0){break;}
                else if(num_to_count < LOWER_BOUND || num_to_count > UPPER_BOUND){
                    System.out.println("ENTER A VALIUD NUMBER");
                   continue; 
                }

                for(int i = LOWER_BOUND; i <= num_to_count; i++){
                    printString.append(i);
                    System.out.print(i);
                    System.out.print(' ');

                }
                System.out.println();
                System.out.println(printString);
                break;
                
            }
        }




    public static void main(String args[]){
        //f8();
        //palindrome();
        count();

    }



    
}
