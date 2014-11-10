// Write a Java program that reads in a series of positive integers 
// and writes out the product of all the integers less than 25 and
// the sum of all the integers greater than or equal to 25.
// Use 0 as a sentinel value.

import java.util.Scanner;


public class Exercise23 {

 public static void main(String[] args) {
  int product = 1;
  int sum = 0;
  Scanner inp = new Scanner(System.in);
  int value = 0;
  
  do {
   System.out.print("Enter a positive integer: ");
   value = inp.nextInt();

   if (value < 25 && value != 0) {
    product = product * value;
   }
   else { // adding 0 will not change sum!
    sum = sum + value;
   }
  } while (value != 0);
  
  System.out.println("Product of integers less than 25: " + product);
  System.out.println("Sum of integers more than or equal to 25: " + sum);
 }
}
