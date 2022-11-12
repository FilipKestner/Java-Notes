package m5_basic_concepts.example_rectangle;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int  height;
    private int ratio;

    public Rectangle(int x, int y, int width, int height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }
    public Rectangle(){
        this(0,0,1,1);
    }
    public Rectangle(Rectangle rectangle) {
        this(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
        // setX(rectangle.getX());
        //setY(rectangle.getY());
        //setWidth(rectangle.getWidth());
        //setHeight(rectangle.getHeight());
    };

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        if (width < 0){
            System.out.println("No negative width allowed");
            return;
        }
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        if (height < 0){
            System.out.println("No negative height allowed");
            return;
        }
        this.height = height;
    }
    public int calculateArea() {
        int area = width * height;
        return area;
    }

    public void grow(int ratio) {
        height *= ratio;
        width *= ratio;
    }
    public void grow (int height, int width){
        height+=height;
        width+=width;
    }
}
