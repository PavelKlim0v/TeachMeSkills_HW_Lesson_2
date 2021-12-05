package Cycles;

/**
 *  Задание 4.
 * 	  Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 	  7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 * 	  В решении используйте цикл while.
 */

public class Task4 {

    public void taskC4() {
        int result = 0;
        int a = 1;
        while (result < 98) {
            result = a * 7;
            System.out.println(result);
            a++;
        }
    }
}
