import java.awt.*;
import java.util.Scanner;

public class Exercise37 {
  
  
  public static void main(String[] args) { 
    Scanner inp = new Scanner(System.in);
    int response = 0;
    
    Frame f = new Frame("Three Buttons");
    f.setSize(500, 500);
    f.setVisible(true);
    
    Graphics g = f.getGraphics();
    g.drawRect(60, 100, 100, 60);
    g.drawRect(190, 100, 100, 60);
    g.drawRect(320, 100, 100, 60);
    g.drawString("Start", 100, 133);
    g.drawString("Stop", 230, 133);
    g.drawString("Pause", 350, 133);

    
    response = inp.nextInt();
    System.exit(0);
  }
}
