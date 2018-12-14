package week01;
/***********************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 01 (3/9-7/9)
 *
 * Description: Reads two command-line arguments and prints both out
 * in a sentence. By doing this exercise you will learn the difference
 * between print() and println().
 *
 * Examples:
 * &gt; java NameAge Alice 19
 * Alice is 19 years old.
 * &gt; java NameAge FatherTime 999
 * FatherTime is 999 years old.
 *
 * (укр.) Опис: Прочитати два аргументи з командної строки та вивести обидва
 * у вигляді речення. Виконуючи цю вправу, ви маєте відчути різницю між
 * операторами виводу print() та println().
 *
 * Приклад:
 * > java NameAge Alice 19
 * Alice виповнилось 19 років.
 * > java NameAge FatherTime 999
 * FatherTime виповнилось 999 років.
 ***********************************************************************/

public class NameAge {
    public static void main(String[] args) {


        // Modify HelloWorld.java to read a name and an age from
        // the command line (both handled as String arguments) and
        // output: [NAME] is [AGE] years old.
        //
        // Модифікуйте HelloWorld.java для читання імені NAME та віку AGE з
        // командної строки (обидва аргументи є строками String).
        // Необхідно вивести (на екран): [NAME] виповнилось [AGE] років.
        //

        System.out.print(args[0]);
        System.out.print(" виповнилось ");
        System.out.print(args[1]);
        System.out.println(" років.");

    }
}
