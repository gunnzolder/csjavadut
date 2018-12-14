package week04;
/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 04
 *
 * 
 * Описание: на русском в учебнике, стр.99 №1.3.5
 * 
 * Description: Simulate the roll of a loaded six-sided die, where
 * the values 1, 2, 3, 4, and 5 appear with probability 1/8 and the
 * value 6 appears with probablity 3/8. Print the resulting number.
 *
 * Examples:
 * > java RollLoadedDie
 * 4
 * > java RollLoadedDie
 * 6                                 (This is Booksite Web Exercise 1.3.2.)
 *************************************************************************/

public class RollLoadedDie {
   public static void main(String[] args) {

      // generate a random number in the range [1;8]
      int r = (int)(Math.random()*8)+1;

      // compute the roll with desired probabilities:
      // [1..5] => [1..5] (1/8)
      // [6,7,8]  =>  [6] (3/8)
      int roll = (r<6) ? r : 6;

      // print the roll
      System.out.println(roll);
   }
}

