package m5_basic_concepts.a04_operations;

public class Operations {
    private int numberOne;
    private int numberTwo;

    public Operations(int numberOne, int numberTwo) {
        setNumberOne(numberOne);
        setNumberTwo(numberTwo);
    }
    public int getNumberOne() {
        return numberOne;
    }
    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }
    public int getNumberTwo() {
        return numberTwo;
    }
    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int calculateSum(){
        int sum = numberOne + numberTwo;
        return sum;
    }
    public int calculateDifference(){
        int difference = numberOne - numberTwo;
        return difference;
    }
    public int calculateProduct(){
        int product = numberOne * numberTwo;
        return product;
    }
    public double calculateQuotient(){
        double quotient = ((double)numberOne)/((double)numberTwo);
        return quotient;
    }

    public String toString(){
        return String.format("The sum is: %d \nThe difference is: %d \nThe product is: %d \nThe quotient is: %f", calculateSum(), calculateDifference(),calculateProduct(), calculateQuotient());
    }
}
