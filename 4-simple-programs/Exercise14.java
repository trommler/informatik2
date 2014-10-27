import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    int length, width;
    Scanner inp = new Scanner(System.in);
    
    System.out.print("Enter length: ");
    length = inp.nextInt();
    
    System.out.print("Enter width: ");
    width = inp.nextInt();
    
    int area = length * width;
    
    System.out.println("Area is: " + area);
  }
}