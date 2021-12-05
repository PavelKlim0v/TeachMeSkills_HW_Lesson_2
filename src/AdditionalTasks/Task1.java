package AdditionalTasks;

/**
 *  Задание 1.
 *    Выведите на экран первые 11 членов последовательности Фибоначчи
 *
 *   №  //   1    2    3    4    5    6    7     8     9    10    11
 *  -----------------------------------------------------------------
 *   F  //   0    1    1    2    3    5    8    13    21    34    55
 */

public class Task1 {

    public void taskAT1() {
        int f0 = 0;
        int f1 = 1;
        int f2;
        System.out.println(f0);
        System.out.println(f1);

        for (int x = 0; x < 9; x++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            System.out.println(f2);
        }
    }
}
