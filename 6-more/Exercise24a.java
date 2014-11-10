// Write a Java program that reads in 10 integer quiz grades and computes the average grade.
// (Hint: Remember the peculiarity of integer division.)

import java.util.Scanner;


public class Exercise24a {

 public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);
  final int number = 10;
  
  int count = 1;
  int grade = 0;
  double total = 0.0;
  double average = 0.0;
  
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
