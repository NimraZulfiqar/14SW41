/**
* Create class named GenerateRandomNumber
*Class responsible for generating random numbers between 0 to 200
* @param ID - 14Sw41
* @param name - Nimra Zulfiqar
* @param address - Muet Software dept form 14 batch
* @param phone - ************
* @param email - nimrazulfiqar31@gmail.com
*/



/* Program: Random number generator
 * Written by: Nimra Zulfiqar
 * Input: None
 * Output:Random number between o and 200*/
import java.util.*;
class GenerateRandomNumber {
   public static void main(String[] args) {
      int counter;
      Random rnum = new Random();
      /* Below code would generate 5 random numbers
       * between 0 and 200.
       */
      System.out.println("Random Numbers:");
      System.out.println("***************");
      for (counter = 1; counter <= 5; counter++) {
         System.out.println(rnum.nextInt(200));
      }
   }
}