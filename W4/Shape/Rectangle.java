public class Rectangle extends Shape {
    private double width;
    private double length;

    /* CONSTRUCTOR */
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    // return the total area of the rectangle
    public double area() {
        return width * length;
    }

    // return the rectangle as a string
    @Override
    public String toString() {
        return super.toString() + " of length = " + length + " and width = " + width;
    }
}
