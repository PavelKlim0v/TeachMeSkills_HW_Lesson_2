package ManagementStructures;

import java.util.Scanner;

/**
 *  Задание 3.
 * 	  Напишите программу которая будет принимать на вход число и на выход будет
 * 	  выводить сообщение четное число или нет.
 * 	  Для определения четности числа используйет операцию получения
 * 	  остатка от деления - операция выглядит так: '% 2'.
 */

public class Task3 {

    public void taskMS3() {
        System.out.println("Enter a number. And we will confirm whether it is even or odd.");
        Scanner scan = new Scanner(System.in);
        long number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
