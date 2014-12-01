// Write a Java program to compute the cost of carpeting three rooms.
// Room objects have dimensions of width and length, and they can compute
// and return their area and (given the price per square unit) the cost to
// carpet themselves. The main method of the RoomApp class should create a
// Room object and use a loop to process each of three rooms: get the dimensions
// and carpet price, write out the individual areas and costs, add the three costs,
// then write out the total cost. 
// (See Exercise 11 on how to format output to two decimal places, as is usually
// done with monetary values.)
public class Room {
  private double length, width;
  
  public void setLength(double length) {
    this.length = length;
  }
  
  public void setWidth(double width) {
    this.width = width;
  }
  
  public double doArea() {
    return length * width;
  }
  
  public double doCarpeting(double price) {
    return price * doArea();
  }
}