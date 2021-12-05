package ManagementStructures;

import java.util.Scanner;

/**
 *  Задание 4.
 * 	  Для введенного числа t (температура на улице) вывести
 * 	  Если t>–5, то вывести «Тепло».
 * 	  Если –5>= t > –20, то вывести «Нормально».
 *    Если –20>= t, то вывести «Холодно».
 */

public class Task4 {

    public void taskMS4() {
        System.out.println("Введите желаемую температуру.");
        Scanner scan = new Scanner(System.in);
        byte t = scan.nextByte();

        if (t > -5) {
            System.out.println("Тепло.");
        } else if ((-5 <= t) || (t > -20)) {
            System.out.println("Нормально.");
        } else if (-20 >= t) {
            System.out.println("Холодно!!!");
        }
    }
}
