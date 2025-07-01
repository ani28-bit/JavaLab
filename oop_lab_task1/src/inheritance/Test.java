package inheritance;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape("red", false);
        System.out.println(s1);
        System.out.println(s2);

        Circle c1 = new Circle("blue", true, 5);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle("yellow", false, 4, 6);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Square sq1 = new Square("black", true, 7);
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());
    }

}
