public class Circle extends Shape {
    private double radius;

    /* CONSTRUCTOR */
    // Constructor 1: no-args
    public Circle() {
        super();
        radius = 1.0;
    }

    // Constructor 2: radius input by user
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor 3: color, filled, radius input by user
    public Circle(double radius, String color, boolean fill) {
        super(color, fill);
        this.radius = radius;
    }

    /* Getter & Setter */
    // radius getter: return the value of the radius
    public double getRadius() {
        return radius;
    }
    // radius setter: set the value of the radius with new value
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // return total area of circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // return perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius; 
    }

    // print
    @Override
    public String toString() {
        return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
}