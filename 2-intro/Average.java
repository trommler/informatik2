import java.util.Scanner;

public class Average {
  static public void main(String[] args) {
    int note1, note2, note3;
    double average;
    // prepare input
    Scanner inp = new Scanner(System.in);
    // Eingabe
    System.out.print("Geben Sie die erste Note ein: ");
    note1 = inp.nextInt();
    
    System.out.print("Geben Sie die zweite Note ein: ");
    note2 = inp.nextInt();
    
    System.out.print("Geben Sie die dritte Note ein: ");
    note3 = inp.nextInt();
    //Verarbeitung
    average = (note1 + note2 + note3)/3.0;
    // Ausgabe
    System.out.println("Die Durchschnittsnote ist: " + average);
  }
}