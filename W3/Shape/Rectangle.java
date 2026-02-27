public class Rectangle extends Shape {
    private double width;
    private double length;

    /* CONSTRUCTOR */
    // Constructor 1: no-args
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }
    // Constructor 2: width & length input by user
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    // Constructor 3: color, filled, width & length input by user
    public Rectangle(double width, double length, String color, boolean fill) {
        super(color, fill);
        this.width = width;
        this.length = length;
    }

    /* Getter & Setter */
    // width getter: return the value of the width
    public double getWidth() {
        return width;
    }
    // width setter: set teh width of the rectangle with new value
    public void setWidth(double width) {
        this.width = width;
    }
    // length getter: return the value of the length
    public double getLength() {
        return length;
    }
    // length setter: set the length of the rectangle with new value
    public void setLength(double length) {
        this.length = length;
    }

    // return total area of the rectangle
    public double getArea() {
        return width * length;
    }
    // return perimeter of the rectangle
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    // print
    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }
}
