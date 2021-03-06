package week04;
/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 04
 *
 * Описание: программа принимает через аргумент коммандной строки
 * значение параметра n и выводит сумму (1 + 2 + ... + n).
 *
 * Description: This program takes a command-line argument n and prints
 * the sum (1 + 2 + ... + n).
 *
 * Examples:
 * > java FiniteSum 1
 * 1
 * > java FiniteSum 2
 * 3
 * > java FiniteSum 10
 * 55
 ******************************************************************************/

public class FiniteSum {
    public static void main(String[] args) {
        
        // read first command-line argument
        int n = Integer.parseInt(args[0]);
            
        // this variable is your running sum
        int sum = 0;
        
        // write a for-loop to calculate 'sum'
        for (int i = 1; i <= n; i++) sum += i;

        // print 'sum'
        System.out.println(sum);

    }
}

// Answer is in the reading!

