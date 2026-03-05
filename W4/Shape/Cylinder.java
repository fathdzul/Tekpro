public class Cylinder extends Shape {
    private double radius;
    private double height;

    /* CONSTRUCTOR */
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // return the surface area of the Cylinder
    public double area() {
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height); 
    }

    // return the Cylinder as a String
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and heigth " + height;
    }
}