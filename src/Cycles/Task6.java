package Cycles;

/**
 *  Задание 6.
 *    Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
 */

public class Task6 {

    public void taskC6() {
        int a = 10;
        for (int i = 0; i <= 10; i++) {
            int x = a * a;
            System.out.println(x);
            a++;
        }
    }
}
