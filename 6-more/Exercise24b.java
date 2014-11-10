// Write a Java program that asks the user for the number of quiz grades,
// reads them in, and computes the average grade.

import java.util.Scanner;


public class Exercise24b {

 public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);
  int number = 0;
  
  int count = 1;
  int grade = 0;
  double total = 0.0;
  double average = 0.0;
  
  System.out.print("Enter number of grades: ");
  number = inp.nextInt();
  
  while (count <= number) {
   System.out.print("Enter grade for quiz "+ count + ": ");
   grade = inp.nextInt();
   total = total + grade; // total += grade;
   count = count + 1; // count ++
  }
  average = total/(double)number;
  
  System.out.println("Average grade is: " + average);
 }

}
