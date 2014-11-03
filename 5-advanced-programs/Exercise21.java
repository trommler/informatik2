// Write a Java program that asks for the user’s age in years;
// if the user is under 35, then quote an insurance rate of $2.23 
// per $100 for life insurance; otherwise, quote a rate of $4.32
import java.util.Scanner;

public class Exercise21 {
  public static void main (String[] args) {
    Scanner inp =  new Scanner(System.in);
    int age = 0;
    double rate = 0.0;
    int sum = 0;
    double quote = 0.0;
    
    System.out.print("Enter your age: ");
    age = inp.nextInt();
    if (age < 35) {
      rate = 2.23;
    } else {
      rate = 4.32;
    }
    
    System.out.print("Versicherungssumme: ");
    sum = inp.nextInt();
    
    quote = (sum/100) * rate;
    
    System.out.println("Your yearly payment is: " + quote);
  }
}