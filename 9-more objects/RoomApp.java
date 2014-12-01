// Write a Java program to compute the cost of carpeting three rooms.
// Room objects have dimensions of width and length, and they can compute
// and return their area and (given the price per square unit) the cost to
// carpet themselves. The main method of the RoomApp class should create a
// Room object and use a loop to process each of three rooms: get the dimensions
// and carpet price, write out the individual areas and costs, add the three costs,
// then write out the total cost. 
// (See Exercise 11 on how to format output to two decimal places, as is usually
// done with monetary values.)

import java.util.Scanner;
import java.text.DecimalFormat;

public class RoomApp {
  public static void main(String[] args) {
    Room r = new Room();
    final int THREE = 3;
    Scanner inp = new Scanner(System.in);
    double input = 0.0;
    double roomPrice = 0.0, area = 0.0;
    double total = 0.0;
    DecimalFormat p = new DecimalFormat("0.00");
    
    for (int i=1 ; i<=THREE; i=i+1) {
      System.out.print("Geben Sie die LŠnge des Raums in m ein: ");
      input = inp.nextDouble();
      r.setLength(input);
      
      System.out.print("Geben Sie die Breite des Raums in m ein: ");
      input = inp.nextDouble();
      r.setWidth(input);
      
      System.out.print("Geben Sie den Teppichpreis ein: ");
      input = inp.nextDouble();
      area = r.doArea();
      roomPrice = r.doCarpeting(input);
      
      System.out.println("Die FlŠche des Raums betrŠgt " + p.format(area) + " Quadratmeter.");
      System.out.println("Der Teppic kostet " + p.format(roomPrice) + " Euro.");
      
      total = total + roomPrice;
    }
    
    System.out.println("Das Projekt kostet insgesamt: " + p.format(total) + " Euro.");                    
  }
}