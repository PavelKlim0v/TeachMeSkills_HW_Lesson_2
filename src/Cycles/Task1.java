package Cycles;

/**
 *  Задание 1.
 *    При помощи цикла for вывести на экран нечетные числа от 1 до 99.
 * 	  При решении используйте оперцию инкремента (++).
 */

public class Task1 {

    public void taskC1() {
        for (byte i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
