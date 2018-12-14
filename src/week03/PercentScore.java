package week03;

/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 03
 *
 * Описание: Посчитайте оценку за экзамен, состоящий из двух частей. Для 
 * этого вам необходимо задать 4 аргумента командной строки:
 * 	1. Количество вопросов, на которые вы ответили правильно, 
 * 		на первой части экзамена
 * 	2. Общее количество вопросов первой части
 * 	3. Количество вопросов во второй части экзамена, на которые вы 
 * 		верно ответили
 * 	2. Общее количество вопросов второй части
 *
 * 	Напечатайте оценку в виде процентов (максимум - 100%).
 *
 *  К примеру, запуск PercentScore с параметрами 8 10 15 17 означает,
 *  что всег было 10+17=27 вопросов, и вы ответили верно на 8+15=23 вопроса.
 *  Тогда оценка будет 23.26=0.8518 и вы должны напечатать ее в коносль в виде 
 *  85.18518518518519 %.
 *
 * Description: Compute your grade on a two-part exam. You will
 * be given 4 command-line arguments:
 *   1. The number of questions you got right on the first part.
 *   2. The total number of questions on the first part.
 *   3. The number of questions you got right on the second part.
 *   4. The total number of questions on the second part.
 * Output your percentage score on the exam.
 *
 * For example, for PercentScore 8 10 15 17 since you got a total of
 * 23 questions correct out of 27 and 23/27 = 0.8518 you should print
 * 85.18518518518519.
 *
 * Examples:
 * > java PercentScore 8 10 15 17
 * 85.18518518518519
 *************************************************************************/

public class PercentScore {
    public static void main(String[] args) {

        // read 4 command-line arguments
        int correctAnswers1 = Integer.parseInt(args[0]),
                questionsSum1 = Integer.parseInt(args[1]),
                correctAnswers2 = Integer.parseInt(args[2]),
                questionsSum2 = Integer.parseInt(args[3]);
        float percentage;

        // calculate the result
        percentage = ((float) (correctAnswers1 + correctAnswers2) / (questionsSum1 + questionsSum2)) * 100;

        // print the result
        System.out.println(percentage + "%");
    }
}