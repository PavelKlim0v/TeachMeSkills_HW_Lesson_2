package AdditionalTasks;

import java.util.Scanner;

/**
 *  Задание 2.
 *    За каждый месяц банк начисляет к сумме вклада 7% от суммы.
 *    Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
 *    А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
 *    Для вычисления суммы с учетом процентов используйте цикл for.
 *    Пусть сумма вклада будет представлять тип float.
 */

public class Task2 {

    public void taskAT2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float depositAmount = scan.nextFloat();
        System.out.print("Введите количество месяцев : ");
        float numberOfMonths = scan.nextFloat();

        float percent = 0.07f;      //7% от суммы вклада
        float depositSum;
        float sumOneMonth;

        for (int i = 1; i <= numberOfMonths; i++) {
            sumOneMonth = depositAmount * percent;
            depositSum = depositAmount + sumOneMonth;
            depositAmount = depositSum;
        }
        String sum = String.format("Конечная сумма вклада : %.2f рублей.", depositAmount);
        System.out.print(sum);
    }
}
