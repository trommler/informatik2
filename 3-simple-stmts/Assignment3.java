import java.util.Scanner;

public class Assignment3 {
  public static void main (String[] args) {
    // Aufgabe 6
    int [] list = new int [10];
    
    System.out.println(list[7]);
    
    // Aufgabe 7
    int [][] table = new int [5][3];
    
    System.out.println(table [3][2]);
    
    // Aufgabe 8
    int hours = 0, minutes = 0;
    Scanner inp =new Scanner(System.in);
    
    System.out.print("Geben Sie die Stunden ein: ");
    hours = inp.nextInt();
    System.out.print("Geben Sie die Minuten ein: ");
    minutes = inp.nextInt();
 
    // Aufgabe 9
    int inventoryNumber = 4711, numberOrdered = 7; // numbers just samples
    System.out.println("Artikelnummer " + inventoryNumber
                         + " Anzahl " + numberOrdered);
    // Aufgabe 10
    int age = 32, weight = 187;
    System.out.println("Your age is" + age + "and your weight is"
                         + weight + ".");
  }
}