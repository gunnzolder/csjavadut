package week02;
/***********************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 02
 *
 * Опис: типова коробка з яйцями містить 12 яєць. Напишіть програму, яка приймає
 * з командної строки в, якості першого параметру, кількість яєць. Програма має
 * обрахувати, скільки повністю заповнених коробок з яйцями ви маєте придбати, та
 * скільки скільки яєць залишиться в неповній коробці.
 * Підказка: використайте операцію %.
 *
 * Description: A typical egg carton holds 12 eggs. Write a program that
 * takes an integer command-line argument representing the number
 * of eggs your chickens have laid. Print two numbers: the number of
 * full cartons of eggs you can take to market, and the number of eggs
 * that will be left over. Hint: use %.
 *
 * Examples:
 * > java Eggsactly 12
 * 1 0
 * > java Eggsactly 27
 * 2 3
 *****************************************************************************/

public class Eggsactly {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]), m = n/12;
        System.out.println(m + " " + n%12);

    }
}