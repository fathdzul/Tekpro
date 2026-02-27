public class ShapeTest {
    public static void main(String[] args) {
        // Percobaan untuk constraktur 1(no-args), getter & setter color serta toString
        Shape circle = new Shape();
        System.out.println(circle.getColor());
        circle.setColor("Red");
        System.out.println(circle.toString());
        System.out.println();

        // Percobaan untuk constraktur 2(parameter to set color, parameter to set filled), getter & setter filled serta toString
        Shape rectangle = new Shape("violet", false);
        System.out.println(rectangle.toString());
        rectangle.setFilled(true);
        System.out.println(rectangle.isFilled());
        System.out.println();

        // Percobaan Circle construktor 2(parameter to set radius), getter & setter radius serta toString pada class tersebut
        // Percobaan getArea() dan getParimeter() pada Circle
        Circle lingkaran = new Circle(7);
        System.out.println(lingkaran.toString());
        System.out.println(lingkaran.getArea());
        System.out.println(lingkaran.getRadius());
        lingkaran.setRadius(14);
        System.out.println(lingkaran.getPerimeter());
        System.out.println(lingkaran.toString());
        System.out.println();

        // Percobaan Rectangle 
        Rectangle segiempat = new Rectangle(7, 4);
        System.out.println(segiempat.toString());
        System.out.println(segiempat.getArea());
        System.out.println(segiempat.getWidth() + " " + segiempat.getLength());
        segiempat.setLength(10);
        segiempat.setWidth(15);
        System.out.println(segiempat.getPerimeter());
        System.out.println(segiempat.toString());
        System.out.println();

        // Percobaan Square
        Square kotak = new Square(5);
        System.out.println(kotak.toString());
        System.out.println(kotak.getArea());
        kotak.setLength(10);
        System.out.println(kotak.getWidth() + " " + kotak.getLength());
        kotak.setWidth(15);
        System.out.println(kotak.getWidth() + " " + kotak.getLength());
        System.out.println(kotak.getPerimeter());
        System.out.println(kotak.toString());
    }
}