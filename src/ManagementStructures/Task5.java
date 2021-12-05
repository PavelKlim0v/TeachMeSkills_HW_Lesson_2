package ManagementStructures;

import java.util.Scanner;

/**
 *  Задание 5.
 *    По введенному номеру определить цвет радуги (1 –
 * 	  красный, 4 – зеленый и т. д.)
 */

public class Task5 {

    public void taskMS5() {
        System.out.println("Введите цифру от 1 до 7, чтобы определить цвет радуги.");
        Scanner scan = new Scanner(System.in);
        byte rainbowColor = scan.nextByte();

        if (rainbowColor == 1) {
            System.out.println("Красный");
        } else if (rainbowColor == 2) {
            System.out.println("Оранжевый");
        } else if (rainbowColor == 3) {
            System.out.println("Желтый");
        } else if (rainbowColor == 4) {
            System.out.println("Зеленый");
        } else if (rainbowColor == 5) {
            System.out.println("Голубой");
        } else if (rainbowColor == 6) {
            System.out.println("Синий");
        } else if (rainbowColor == 7) {
            System.out.println("Фиолетовый");
        } else {
            System.out.println("Вы вообще знаете, что такое радуга?");
        }
    }
}
