import java.awt.*;
import java.util.Scanner;

public class Exercise34 {
  
  
  public static void main(String[] args) { 
    Scanner inp = new Scanner(System.in);
    int response = 0;
    
    Frame f = new Frame("Triangle");
    f.setSize(500, 500);
    f.setVisible(true);
    
    Graphics g = f.getGraphics();
    g.drawLine(50, 100, 100,30);
    g.drawLine(100, 30, 150, 100);
    g.drawLine(150, 100, 50, 100);
    
    response = inp.nextInt();
    System.exit(0);
  }
}
