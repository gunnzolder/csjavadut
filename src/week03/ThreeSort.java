package week03;

/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 03
 *
 * Описание: Прочитайте три целых числа из командной строки. Напечатайте 
 * их в консоль в порядке возрастания. 
 *
 * Уточнение: использовать операции сравнения нельзя. Пользуйтесь только
 * методами Math.min() и Math.max() (описание читайте в книге)
 *
 * Description: Reads three integer command-line arguments and prints
 * them in ascending order.
 *
 * Hint: Don't use conditionals for this; use Math.min() and Math.max().
 *
 * Example:
 * % java ThreeSort 17 50 33
 * 17
 * 33
 * 50                                       (This is Book Exercise 1.2.34.)
 *************************************************************************/

public class ThreeSort {
    public static void main(String[] args) {

        // command-line input
        int a = Integer.parseInt(args[0]),
                b = Integer.parseInt(args[1]),
                c = Integer.parseInt(args[2]);

        // compute the order
        int[] sortedArr = {
                Math.min(a, Math.min(b, c)),
                Math.max(a, Math.min(b, c)),
                Math.max(a, Math.max(b, c))
        };

        // output in ascending order
        for (int i = 0; i < sortedArr.length; i++) System.out.println(sortedArr[i]);

    }
}