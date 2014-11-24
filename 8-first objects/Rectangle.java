//Class for rectangles. Area can be 
//computed from length and width.
public class Rectangle { 
  public void setWidth(double value) //sets width equal to value 
  { 
    width = value; 
  } 
  public void setHeight(double value) //sets height equal to value 
  { 
    height = value;
  } 
  public double getWidth() //returns width 
  { 
    return width; 
  } 
  
  public double getHeight() //returns height 
  {
    return height;
  } 
  public double doArea() //computes and returns area of a rectangle 
  { 
    return width*height; 
  } //instance variables
  
  // assignment 28 a
  public double doPerimeter() {
    return 2*(width+height);
  }
  // end assignment 28a
  // assignment 28b
  public static void main(String[] args) {
    Rectangle yuri = new Rectangle();
    yuri.setHeight(1.5);
    yuri.setWidth(2.5);
    System.out.println("area: " + yuri.doArea() + " perimeter: " + yuri.doPerimeter());
  }
  //end assignment 28b
  protected double width, height; 
}