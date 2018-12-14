package week03;

/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 03
 *
 * Описание: выведите расстояние между точками плоскости (0,0) и  (x, y),
 * причем x, y - целые числа. Подсказка: используйте формулу расстояния Евклида:
 * расстояние=квадратный корень из (x в квадрате + y в квадрате)
 *
 * Description: Prints the distance between (0, 0) and (x, y), where x and
 * y are integers.
 *
 * Notes: In case you're rusty on the algebra, we determine this by the
 * Euclidean distance: distance = square root of (x squared + y squared).
 *
 * Example:
 * % java Distance 3 4                                  This is Booksite
 * Distance from (0, 0) to (3, 4) is 5.0.               Web Exercise 1.2.1.
 *************************************************************************/

public class Distance {
    public static void main(String[] args) {

        // input point coordinates
        int x = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]);
        double distance;

        // compute distance
        distance = java.lang.Math.sqrt(x * x + y * y);

        // output distance
        System.out.println("Distance from (0, 0) to (" + x + ", " + y + ") is " + distance + ".");
    }
}