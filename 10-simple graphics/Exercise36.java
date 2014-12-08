import java.awt.*;
import java.util.Scanner;

public class Exercise36 {
  
  
  public static void main(String[] args) { 
    Scanner inp = new Scanner(System.in);
    int response = 0;
    
    Frame f = new Frame("Square and Circle");
    f.setSize(500, 500);
    f.setVisible(true);
    
    Graphics g = f.getGraphics();
    /*
    g.drawLine(60, 100, 160, 100);
    g.drawLine(160, 100, 160, 200);
    g.drawLine(160, 200, 60, 200);
    g.drawLine(60, 200, 60, 100);
    */
    // g.setColor(Color.blue);
    g.drawRect(60, 100, 100, 100);
    g.drawOval(60, 100, 100, 100);

    response = inp.nextInt();
    System.exit(0);
  
  }
}
