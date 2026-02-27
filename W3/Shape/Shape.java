public class Shape {
    private String color;
    private boolean filled;

    /* CONSTRUCTOR */
    // Constructor 1: no-args
    public Shape() {
        color = "green";
        filled = true;
    }

    // Constructor 2: 
    public Shape(String color, boolean fill) {
        this.color = color;
        filled = fill;
    }

    /* SETTER & GETTER */
    // color Getter: return the value of the color
    public String getColor() {
        return color;
    }
    // color Setter: set new value for color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // filled getter: return the value of the filled
    public boolean isFilled() {
        return filled;
    }
    // filled setter: set new value for boolean
    public void setFilled(boolean newfill) {
        this.filled = newfill;
    }

    // Method for show the value of the object
    public String toString() {
        String Status = filled? "Filled": "Not Filled";
        return "A Shape with color of " + color + " and " + Status; 
    }

}
