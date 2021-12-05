package Cycles;

import java.util.Scanner;

/**
 *  Задание 3.
 * 	  Напишите программу, где пользователь вводит любое целое положительное число.
 * 	  А программа суммирует все числа от 1 до введенного пользователем числа.
 * 	  Для ввода числа воспользуйтесь классом Scanner.
 */

public class Task3 {

    public void taskC3() {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long result = 0;
        long nextNum = 0;

        for (long i = 1; i <= num; i++) {
            if (num <= 0) {
                System.out.println("Нужно ввести любое целое положительное число!");
                break;
            }
            nextNum = nextNum + 1;
            result = result + nextNum;
        }
        System.out.println(result);
    }
}
