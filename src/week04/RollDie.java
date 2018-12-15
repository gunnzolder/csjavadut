package week04;
/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 04
 *
 * Описание: Программа должна имитировать подбрасывание игрального кубика,
 * который имеет 6 граней. После запуска программа выводит в консоль 
 * количество точек на выпавшей грани.
 * 
 *
 * Description: Simulate the roll of a fair six-sided die and print
 * the resulting number.
 *
 * Examples:
 * > java RollDie
 * 4
 * > java RollDie
 * 1                                 (This is Booksite Web Exercise 1.3.1.)
 *************************************************************************/

// TO DO: Use casting (like in RandomInt.java)
// to get a random integer between 1 and 6.
// TO DO: Используйте кастинг (как в RandomInt.java) для получения
// целого случайного числа от 1 до 6.


public class RollDie {
   public static void main(String[] args) {
      // вывод результата
      System.out.println(roll());
   }
   public static int roll() {
      // указанные переменные должны обязательно применяться в коде
      // подумайте, какой тип данных должен быть установлен

      // сколько сторон имеет кубик?
      int SIDES = 6;

      // roll should be 1 through SIDES
      return (int) (Math.random() * SIDES) + 1;
   }
}