package m5_basic_concepts.a03_box;

public class Box {
    private String type;
    private double length;
    private double width;
    private double height;

    public Box(String type, double length, double width, double height) {
        setType(type);
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    public Box(String type, double length){
        this(type, length, 10, 10);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateSurface(){
        double surface;
        surface = 2*(length*width + length*height + width*height);
        return surface;
    }
    public double calculateVolume(){
        double volume;
        volume = length*width*height;
        return volume;
    }
    public double calculateTapeLength() {
        double tapeLength;
        if (height <= width && height <=length){
            tapeLength = width*2 + length*2 + height*4;
            return tapeLength;
        }
        else if (width <= height && width <= length){
            tapeLength = width*4 + length*2 + height*2;
            return tapeLength;
        }
        else{
            tapeLength = width*2 + length*4 + height*2;
            return tapeLength;
        }
    }

    public String toString(){
        return String.format("Type: %s \nLength: %f cm \nWidth: %f cm \nHeight: %f cm \nSurface: %f cm^2 \nVolume: %f cm^3 \nMinimum tapelength: %f cm  \n",
                type, length, width, height, calculateSurface(), calculateVolume(), calculateTapeLength());
    }
}
