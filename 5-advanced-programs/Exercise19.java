import java.util.Scanner;

public class Exercise19 {

 public static void main(String[] args) {
  int sum = 0;
  Scanner inp = new Scanner(System.in);
  int number = 0;
  
  System.out.print("Enter first number: ");
  number = inp.nextInt();
  
  do {
   sum = sum + number;
   System.out.print("Enter next number (negative to quit): ");
   number = inp.nextInt();
  } while (number >= 0);
  
  System.out.println("Your sum is: " + sum);
 }

}
