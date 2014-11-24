import java.util.Scanner;

public class Checkbook {
  static public void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    // get initial balance
    System.out.print("Enter initial balance: ");
    balance = inp.nextDouble();
    char answer = ' ';
    
    do {
      System.out.print("(d)eposit, (c)heck or (q)uit? ");
      answer = inp.next().charAt(0);
      if (answer == 'd')
        deposit();
      else if (answer == 'c')
        check();      
    } while (answer != 'q');
  }
  
  static double deposit() {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter amount to deposit: ");
    double amount = inp.nextDouble();
    balance = balance + amount;
    System.out.println("Deposit " + amount + " new balance " + balance);
    return balance;
  }
  
  static double check() {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter amount of check: ");
    double amount = inp.nextDouble();
    balance = balance - amount;
    System.out.println("Check " + amount + " new balance " + balance);
    return balance;
  }
  
  static double balance;
}