package m5_basic_concepts.example_rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(17,12,16,32);
        rectangle.grow(2);
        System.out.println(rectangle.calculateArea());
    }
}
