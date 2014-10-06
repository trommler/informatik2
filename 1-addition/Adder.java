// Adder class
// Author: Peter Trommler
// Faculty of Computer Science

// This class is a very simple addition algorithm.

// License see file LICENSE in toplevel directory

public class Adder {
  public static void main(String[] argv) { // sorry in class I wrote "(int argc, String[] argv)" 
    // static input data
    int[] a = { 4, 3, 2, 1};
    int[] b = { 8, 7, 6, 5};
    // m digit numbers
    int m;
    m = 4;
    // result
    int[] c = new int[m + 1];
    // 1. set carry = 0
    int carry;
    carry = 0;
    // 2. set i = 0
    int i;
    i = 0;
    // 3. while i < m do steps 4 to 10
    while (i < m) {
      // 4. compute sum = a_i + b_i + carry
      int sum;
      sum = a[i] + b[i] + carry;
      // 5. if sum >= 10
      if (sum >= 10) {
        // 6. set carry = 1
        carry = 1;
        // 7. set c_i = sum - 10
        c[i] = sum - 10;
      } else {
        // 8. set carry = 0
        carry = 0;
        // 9. set c_i = sum
        c[i] = sum;
      } // end if
      // 10. set i = i + 1
      i = i + 1;
    } // end while
    // 11. set c_m = carry
    c[m] = carry;
    // 12. print c_m .. c_0
    int counter;
    counter = m;
    while (counter >= 0) {
      System.out.print(c[counter]);
      counter = counter - 1;
    } // end while
  } // end main
} // end class Adder
    
    
        
        