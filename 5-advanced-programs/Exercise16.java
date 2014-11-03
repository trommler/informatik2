public class Exercise16 {
 public static void main(String[] args) {
  int value = 0;
  int top = 10;
  int score = 1;
  while (score <= top)
  {
   value = value + score;
   score = score + 1; //the missing line score += 1; score ++
  }
  // not part of the answer!
  System.out.println("Result: "+value);
 }

}
