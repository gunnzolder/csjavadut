package week04;
/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 04
 *
 * Description: This program takes a command-line argument n and prints a
 * table of the powers of 2 that are less than or equal to 2^n.
 *
 * Examples:
 * > java PowersOfTwo 5
 * 0 1
 * 1 2
 * 2 4
 * 3 8
 * 4 16
 * 5 32
 *
 * Remarks:
 * Works only if 0 <= n < 31, because 2^31 overflows an int.
 ******************************************************************************/

// TO DO: Convert this "while" loop to a "for" loop.

public class PowersOfTwo {
    public static void main(String[] args) {

        // reads the command-line argument
        int n = Integer.parseInt(args[0]);

        // repeat until i equals n
        for (int i=0; i<=n; i++) {
            System.out.println("2^"+i+"="+(int)Math.pow(2, i));
        }

    }
}

