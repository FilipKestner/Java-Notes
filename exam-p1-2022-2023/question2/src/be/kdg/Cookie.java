package be.kdg;

public class Cookie {
    
    // cookieName  -> String (NOT EMPTY OR NULL)
    // amountBaked -> int (No deecimals, NOT NEGATIVE
    // amountLeft  -> int (NO decimals, NOT NEGATIVE, ALWAYS SMALLER THAN amountBaked)
    private String cookieName;
    private int amountBaked;
    private int amountLeft; 

    // Constructers: 
    // ---------------------------------------------------
    public Cookie(){ 
        this.setCookieName("NO NAME");
        this.amountBaked = 0;
        this.amountLeft = 0; 

        // I know I am able to call the 
        // other constructer here to autofill
        // I just forgot the exact syntax for it 


    } // Default

    public Cookie(String name){
        this.setCookieName(name);

        this.amountBaked = 0;
        this.amountLeft = 0;

    } // Only cookeName

    public Cookie(String name, int baked, int left){
        this.setCookieName(name);

        // baked > left ALWAYS 

        if(baked >= left && baked >= 0 && left >= 0){
            this.amountBaked = baked;
            this.amountLeft  = left; 
        }
        else{
            System.out.println("INVALID ENTRY FOR 'baked' or 'left'");

        }

    } // All Fields
    // ---------------------------------------------------


    // ENCAPSULATION: 
    //------------------------------------

    public void setCookieName(String name){

        if(name.trim().length() > 0 ){ // Ensuring name is valid and not empty
            this.cookieName = name; 
        }
        else{
            System.out.printf("\'%1$s\' is an INVALID name\t%n",name);

        }
    }

    public int getAmountBaked(){
        return this.amountBaked;
    }

    public String getCookieName(){
        return this.cookieName; 
    }

    public int getAmountLeft(){

        return this.amountLeft;
    }

    //-------------------------------------

    // Action Functions: 
    // ---------------------------------------------------
    // ** Avoided using '+=' or '-=' for sake of READABILITY
    public void bake(){
        this.amountBaked = this.amountBaked +1; 
        this.amountLeft = this.amountLeft + 1; 
    }

    public void bake(int amount){
        this.amountBaked = this.amountBaked + amount;
        this.amountLeft = this.amountLeft + amount;
    }

    public void eat(int num){
        if(num <= this.amountLeft ){
            this.amountLeft = this.amountLeft - num; 
        }
        else{
            System.out.println("There aren't enough " + 
                this.getCookieName() +" cookies to eat!" );

        }

    }
    // ---------------------------------------------------




    // Overriding toString to allow for System.out.print functions to directly
    // call from here and print appropriate output. 

    @Override
    public String toString(){
        return "The " + this.getCookieName() + " cookies bave been baked " + this.getAmountBaked() 
            + " times! There are currently " + this.getAmountLeft() + " left." ;
    }
    
    
}
