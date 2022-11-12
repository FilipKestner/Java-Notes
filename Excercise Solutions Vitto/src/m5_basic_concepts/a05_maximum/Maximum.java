package m5_basic_concepts.a05_maximum;

public class Maximum {
    private int one;
    private int two;
    private int three;

    public Maximum() {};
    public Maximum(int one, int two, int three) {
        setOne(one);
        setTwo(two);
        setThree(three);
    }
    public Maximum(long one, long two, long three){
        setOne((int)one);
        setTwo((int)two);
        setThree((int)three);
    }
    public Maximum(double one, double two, double three){
        setOne((int)one);
        setTwo((int)two);
        setThree((int)three);
    }

    public int getOne() {
        return one;
    }
    public void setOne(int one) {
        this.one = one;
    }
    public int getTwo() {
        return two;
    }
    public void setTwo(int two) {
        this.two = two;
    }
    public int getThree() {
        return three;
    }
    public void setThree(int three) {
        this.three = three;
    }

    public double max(){
        return max(this.one, this.two, this.three);
        /*double maximumNumber;
        if( one >= two && one >= three ){
            maximumNumber = one;
            return maximumNumber;
        }
        else if( two >= one && two >= three ) {
            maximumNumber = two;
            return maximumNumber;
        }
        else {
            maximumNumber = three;
            return maximumNumber;
        } */
    }

    public double max(int one, int two, int three){
        return max((long)one, (long)two, (long)three);
        /* double maximumNumber;
        if( one >= two && one >= three ){
            maximumNumber = one;
            return maximumNumber;
        }
        else if( two >= one && two >= three ) {
            maximumNumber = two;
            return maximumNumber;
        }
        else {
            maximumNumber = three;
            return maximumNumber;
        } */
    }

    public double max(long one, long two, long three){
        double maximumNumber;
        if( one >= two && one >= three ){
            maximumNumber = one;
            return maximumNumber;
        }
        else if( two >= one && two >= three ) {
            maximumNumber = two;
            return maximumNumber;
        }
        else {
            maximumNumber = three;
            return maximumNumber;
        }
    }

    public double max(double one, double two, double three){
        return max(this.one, this.two, this.three);
        /* double maximumNumber;
        if( one >= two && one >= three ){
            maximumNumber = one;
            return maximumNumber;
        }
        else if( two >= one && two >= three ) {
            maximumNumber = two;
            return maximumNumber;
        }
        else {
            maximumNumber = three;
            return maximumNumber;
        } */
    }

}
