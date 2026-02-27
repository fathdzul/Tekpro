public class Square extends Rectangle {
    /* CONSTRUCTOR */
    // Constructor 1: no-args
    public Square() {
        super();
    }
    // Constructor 2: side input by user
    public Square(double side) {
        super(side, side);
    }
    // Constructor 3: color, fill & side input by user
    public Square(double side, String color, boolean fill) {
        super(side, side, color, fill);
    }

    /* Getter & Setter */
    // side getter: return the value of the side
    public double getSide() {
        return super.getLength();
    }
    // side setter: set the value of the side with new value
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    // override setWidth to make the length is same with width
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    // override setlength to make the width is same with length
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // print
    @Override
    public String toString() {
        return "A Square with side = " + super.getLength() + ", which is a subclass of " + super.toString();
    }
}
