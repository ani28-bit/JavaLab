package inheritance;

public class Shape {
  private  String color;
  private boolean filled;

 public Shape(){
      this.color = "green";
      this.filled = true;
  }

  public Shape(String color,boolean filled){
       this.color = color;
       this.filled = filled;
  }

  public void setColor(String color){
           this.color = color;
  }

  public String getColor(){
           return color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public boolean getFilled(){
        return filled;
    }

    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }

}
