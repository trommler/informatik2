// Write a nonvoid Java method that receives a real number argument
//  representing the sales amount for videos rented so far this month. 
//  The method asks the user for the number of videos rented today and 
//  returns the updated sales figure to the main method. All videos rent
//  for $4.25.

import java.util.Scanner;

public class Exercise26 {
  // All videos rent for $4.25.
  static final double price = 4.25;
  
  static double updateSales(double salesOld) {
    Scanner inp = new Scanner(System.in);
    int numberOfVideos;
    
    System.out.print("How many videos today: ");
    numberOfVideos = inp.nextInt();
   
    double newSales = salesOld + numberOfVideos * price;
    
    return newSales;
  }
  
  static public void main(String[] args) {
    double sales = updateSales(100.25); // old sales: sample value 100.25
                                        // nothing special and yes, this was not the
                                        // result of previous sales at 4.25 each!
    
    System.out.println("New sales figure: " + sales);
  }
}