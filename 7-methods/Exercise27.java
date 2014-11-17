// Write a nonvoid Java method that receives three integer arguments and
// returns the maximum of the three values.
public class Exercise27 {
  static int max(int a1, int a2, int a3) {
    int maxi;
    
    if (a1 > a2) {
      maxi = a1;
    } else {
      maxi = a2;
    }
    if (a3 > maxi) { maxi = a3;}
    return maxi;
  }
  
  public static void main(String[] args) {
    System.out.println("Max: " + max(4, 9, 3));
  }
}