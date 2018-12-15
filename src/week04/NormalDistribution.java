package week04;

/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 04
 *
 * Generate and print N random values between 0.0 and 1.0, and print
 * their average value, min value, and max value.
 *
 * Описание:
 * 1.3.10
 * Напишите программу, которая получает целое число n как аргумент
 * командной строки, использует Math.random() для вывода n случайных
 * значений с равномерным распределением в интервале от 0 до 1, после чего
 * выводит их среднее значение (см. упражнение 1.2.30)
 *
 * [Anton Parkhomenko]
 * NB: в интервале от 0 до 1 - [0;1] или (0;1)?
 * Для переключения inclusive/exclusive введен второй аргумент (boolean):
 *
 * > NormalDistribution 3 false
 * Generating uniformly distributed items within the range (0;1):
 * [0.25, 0.5, 0.75]
 *
 * > NormalDistribution 3 true
 * Generating uniformly distributed items within the range [0;1]:
 * [0.0, 0.5, 1.0]
 *
 * NB2: Я бы переименовал класс в UniformDistribution, т.к.
 * Равномерное распределение - Uniform distribution (англ)
 *
 * В данном случае используется Дискретное р.р. (конечное число значений):
 * https://en.wikipedia.org/wiki/Discrete_uniform_distribution
 *
 * Normal distribution - нормальное распределение,
 * которое по определению занимает весь диапазон (-∞;+∞), следовательно,
 * нельзя "нормально" распределить n значений в пределах диапазона [x₁;x₂]
 * https://en.wikipedia.org/wiki/Normal_distribution
 *
 *************************************************************************/

public class NormalDistribution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean inclusive = Boolean.parseBoolean(args[1]);
        double sum = 0, average;
        double[] arr = makeUniformArray(n, inclusive);

        System.out.println(java.util.Arrays.toString(arr));
        System.out.println("Items in array: " + n);

        System.out.println("\nPicking " + n + " random items: ");

        for (int j = 0, i; j < arr.length; j++) {
            i = (int) (Math.random() * n);
            System.out.println(arr[i]);
            sum += arr[i];
        }

        average = sum / n;

        System.out.println("Average: " + average);
    }

    public static double[] makeUniformArray(int n, boolean inclusive) {

        double[] arr = new double[n];
        double step;

        if (inclusive) {
            System.out.println("Generating uniformly distributed items within the range [0;1]:");
            step = 1 / (double) (n - 1);
            for (int i = 0; i < arr.length; i++) arr[i] = step * i;
        } else {
            System.out.println("Generating uniformly distributed items within the range (0;1):");
            step = 1 / (double) (n + 1);
            for (int i = 0; i < arr.length; i++) arr[i] = step * (i + 1);
        }
        return arr;
    }

}
