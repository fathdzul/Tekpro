public abstract class Shape {
    protected String shapeName;

    /* CONSTRUCTOR */
    public Shape(String name) {
        shapeName = name; 
    }

    // method that return the area of the shape
    public abstract double area();

    // method that return the name of the shape
    public String toString() {
        return "name = " + shapeName;
    }
}
