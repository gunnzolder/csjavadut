package week04;
/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 04
 *
 *  Prints ith Hello for i = 1 to n.
 *
 *  % java TenHellos
 *  1st Hello
 *  2nd Hello
 *  3rd Hello
 *  4th Hello
 *  5th Hello
 *  6th Hello
 *  7th Hello
 *  8th Hello
 *  9th Hello
 *  10th Hello
 *  11th Hello
 *  12th Hello
 *  13th Hello
 *  14th Hello
 *  15th Hello
 *  16th Hello
 *  17th Hello
 *  18th Hello
 *  19th Hello
 *  20th Hello
 *  21st Hello
 *  22nd Hello
 *  23rd Hello
 *  24th Hello
 *
 *  Program Hellos.java that takes the number of lines to print as a
 *  command-line argument. You may assume that the argument is less
 *  than 1000. Hint: consider using i % 10 and i % 100 to determine
 *  whether to use "st", "nd", "rd", or "th" for printing the ith Hello.
 *
 *************************************************************************/

public class ImprovedTenOfHellos {
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		String ending;

		for (int i = 1; i <= n; i++) {

			ending = 	(i % 100 >= 11 && i % 100 <= 20) ? "th" :
						(i % 10 == 1) ? "st" :
						(i % 10 == 2) ? "nd" :
						(i % 10 == 3) ? "rd" :
						"th";

			System.out.println(i + ending + " Hello");
		}

	}

}
