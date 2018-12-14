package week01;
/***********************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 01 (3/9-7/9)
 *
 * Description: NextYear takes two command-line arguments, a name and
 * an age. It prints how old that person will be next year. By
 * doing this exercise, you will learn the difference between +
 * for concatenation and + for addition.
 *
 * Examples:
 * > java NextYear Alice 19
 * Next year Alice will be 20 years old.
 * > java NextYear FatherTime 999
 * Next year FatherTime will be 1000 years old.
 *
 * (укр.) Опис: NextYear приймає два параметра з командної строки, ім"я та вік.
 * Вона виводить у консоль вік, який буде у даної особи наступного року.
 * Виконуючи це завдання, ви вивчите різницю між операцією "+" - в ролі конкатенації та
 * в ролі оператора додавання чисел.
 * Приклад:
 * > java NextYear Alice 19
 * В наступному році Alice буде 20 років.
 * > java NextYear FatherTime 999
 * В наступному році FatherTime буде 1000 років.
 ***********************************************************************/

public class NextYear {
    public static void main(String[] args) {


        // Modify NameAge.java. Use Integer.parseInt() to store the
        // age as an integer and output: Next year [NAME] will be [AGE+1]
        // years old.
        //
        // Модифікуйте NameAge.java. Використайте Integer.parseInt() для
        // перетворення віку з строкового представлення (String) у число (integer).
        // Вевидіть (на екран): В наступному році [NAME] буде [AGE+1] рік.
        //

        System.out.print(" Наступного року ");
        System.out.print(args[0]);
        System.out.print(" буде ");
        System.out.print(Integer.parseInt(args[1]) + 1);
        System.out.println(" років.");


    }
}
