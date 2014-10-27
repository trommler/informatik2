import java.text.*;

public class Exercise11 {
  public static void main (String[] args) {
    double density = 63.78;
    
    DecimalFormat p = new DecimalFormat("0.0");
    
    System.out.println("The current density is " + p.format(density)
                         + ", to within one decimal place.");
  }
}