// Write a Java program that reads integer values until a 0 value is encountered,
// then writes out the sum of the positive values read and the sum of the
// negative values read.
import java.util.Scanner;

public class Exercise22 {
  public static void main(String[] args) {
    int value = 0;
    int positive = 0;
    int negative = 0;
    Scanner inp = new Scanner(System.in);
    
    do {
      value = inp.nextInt();
      if (value < 0) {
        negative += value;
      } else if (value > 0) {
        positive = positive + value;
      }
    } while (value != 0);
    
    System.out.println("Sum of positive numbers: " + positive
                         + " sum of negatives " + negative);
  }
}