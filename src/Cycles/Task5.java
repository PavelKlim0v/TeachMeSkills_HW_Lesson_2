package Cycles;

/**
 *  Задание 5.
 *    Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 */

public class Task5 {

    public void taskC5() {
        int x = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(x);
            x = x - 5;
        }
    }
}
