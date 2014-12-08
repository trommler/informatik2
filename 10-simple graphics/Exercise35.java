import java.awt.*;
import java.util.Scanner;

public class Exercise35 {
  
  
  public static void main(String[] args) { 
    Scanner inp = new Scanner(System.in);
    int response = 0;
    
    Frame f = new Frame("Ex 35");
    f.setSize(500, 500);
    f.setVisible(true);
    
    Graphics g = f.getGraphics();
    g.drawLine(1,1,4,5);

    response = inp.nextInt();
    System.exit(0);
   
  }
  
  /* ADD YOUR CODE HERE */
  
}
