package inheritance;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;

    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }


    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length +
                ", which is a subclass of " + super.toString();
    }

}




