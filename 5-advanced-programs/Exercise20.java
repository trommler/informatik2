import java.util.Scanner;

public class Exercise20 {
 public static void main(String[] args) {
  int hours = 0;
  int minutes = 0;
  Scanner inp = new Scanner(System.in);
  
  System.out.print("Enter number of hours: ");
  hours = inp.nextInt();
  System.out.print("Enter number of minutes: ");
  minutes = inp.nextInt();
  
  int duration = hours * 60 + minutes;
  
  System.out.println("Duration is " + duration + " minutes.");
 }
}
