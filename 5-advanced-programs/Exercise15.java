import java.util.Scanner;

public class Exercise15 {
 public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);
  String response = "";
  char c = ' ';
  
  System.out.print("Enter a character: ");
  response = inp.next();
  c = response.charAt(0);
  
  if (response.length() == 1 && (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
   System.out.println("Congratulations, you picked a vowel!");
  } else {
   System.out.println("You lose, better luck next time!");
  }
 }

}
