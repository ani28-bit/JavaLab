package inheritance;

public class Circle extends Shape{
        private double radius;

   public Circle(){
        super();
        this.radius = 1.0;

    }

   public Circle(String color,boolean filled,double radius){
            super(color,filled);
            this.radius = radius;
    }

    public void setRadius(double Radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return  Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return  2 * Math.PI * radius;
    }

    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }

}




