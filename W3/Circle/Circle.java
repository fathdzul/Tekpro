/**
* The Circle class models a circle with a radius and color.
*/

public class Circle { 
// private instance variable, not accessible from outside this class
private double radius;
private String color;

// Constructors (overloaded)
/** Constructs a Circle instance with default value for radius and color */
public Circle() { // 1st (default) constructor
    radius = 1.0;
    color = "red";
}
/** Constructs a Circle instance with the given radius and default color */
public Circle(double r) { // 2nd constructor
    radius = r;
    color = "red";
}
/** Constructor circle input radius and color by user */
public Circle(double r, String color) {
    radius = r;
    this.color = color;
}

// getter & Setter
/** Returns the radius */
public double getRadius() {
    return radius;
}
/** Returns the area of this Circle instance */
public double getArea() {
    return radius * radius * Math.PI;
}
/** * Return a self-descriptive string of this instance in the form of
* Circle[radius=?,color=?]
*/
public String toString() {
    return "radius = " + radius + " color = " + color;
}

/* return value of the color */
public String getColor() {
    return color;
}

/* set color with new value */
public void setColor(String newColor) {
    this.color = newColor;
}
}