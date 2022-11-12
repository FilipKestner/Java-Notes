package be.kdg;

public class Question2 {
    public static void main(String[] args) {
        
        Cookie cookie1 = new Cookie("biscuit");
        Cookie cookie2 = new Cookie("chocolate chip");
        
        // The arguments passed to the following constructor are the cookie's name, the number of cookies that have been baked in the past, and the number of cookies you currently have left.
        Cookie cookie3 = new Cookie("peanutbutter", 3, 0);

        cookie1.setCookieName("cream");

        for (int i = 0; i < 10; i++) {
            // The bake-method bakes one cookie.
            // In this method,update the Cookie attributes that keep track of the number of cookies baked/left.
            cookie1.bake();
        }

        System.out.println("Oh my! There are " + cookie1.getAmountBaked() + " " + cookie1.getCookieName() + " cookies!");

        // this method bakes 25 cookies. Update the related Cookie attributes
        cookie2.bake(25);

        // The following eat-method eats 7 cookies.
        // In this method, update the related Cookie attributes.
        // If there are not enough cookies left, do not eat any cookies, but print an error message

        cookie1.eat(7);
        
        cookie2.eat(10);
        
        System.out.println("I'm almost full. I can put the " + cookie2.getAmountLeft() + " remaining " + cookie2.getCookieName() + " cookies in the fridge.");
        cookie3.eat(2);

        

        System.out.println(cookie1);
        System.out.println(cookie2);
        System.out.println(cookie3);




        // PERSONAL TESTING
        // ------------------------------
        // System.out.println("-------------------------------");
        // Cookie testCookie = new Cookie("yolo");

        // testCookie.setCookieName("    ");

        // System.out.print("1: ");
        // Cookie invalidCookie1 = new Cookie("bad cookie",-1,5); // Negative Baked

        // System.out.print("2: ");
        // Cookie invalidCookie2 = new Cookie("bad cookie",5,-1); // Negative Left

        // System.out.print("3: ");
        // Cookie invalidCookie3 = new Cookie("bad cookie",1,5); // Left > Baked

        // System.out.print("4: ");
        // Cookie invalidCookie4 = new Cookie("bad cookie",5,5); // Valid Check
        // System.out.println(invalidCookie4);




    }
}
