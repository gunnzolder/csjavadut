package week04;

/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 04
 *
 * Описание:
 *
 * Напишите программу, которая вычисляет и выводит сумму, которая выводит
 * сумму, которую вы получите через t лет при размещении P долларов под
 * ежегодный процент r (непрерывно начисляемый). Искомое значение
 * вычисляется по формуле P*e^(r*t).
 *
 * Выводите общую накопленную сумму и текущие проценты после каждого
 * ежемесячного перерасчета вклада.
 *
 * (Это управжение из книги, условие задачи №1.3.17)
 *************************************************************************/

public class ImpovedInterestCapitalization {
    public static void main(String[] args) {

        int     P = Integer.parseInt(args[0]),
                t = Integer.parseInt(args[1]),
                r = Integer.parseInt(args[2]);

        int     tMonths = t * 12;
        double  decimalRate = (double) r / 100;

        for (int i = 0; i <= tMonths; i++)
            System.out.println("Month " + i + ": $" + (int) interestFromMonths(P, i, decimalRate));

        System.out.println("Initial sum: $" + P);
        System.out.println("Interest: " + r + "% annually");
        System.out.println("Final withdrawal sum after " + t + " years: $" + (int) interestFromMonths(P, tMonths, decimalRate));
    }

    public static double interestFromMonths(int P, int m, double decimalRate) {
        return P * Math.exp(decimalRate / 12 * m);
    }

}