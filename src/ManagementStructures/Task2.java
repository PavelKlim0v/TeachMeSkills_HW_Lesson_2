package ManagementStructures;

import java.util.Scanner;

/**
 *  Задание 2.
 *    Написать программу для вывода названия поры года по номеру месяца.
 * 	  При решении используйте оператор if-else-if.
 */

public class Task2 {

    public void taskMS2() {
        System.out.println("Enter the month number.");
        Scanner scan = new Scanner(System.in);
        byte numberOfMonth = scan.nextByte();

        if ((numberOfMonth == 1) || (numberOfMonth == 2) || (numberOfMonth == 12)) {
            System.out.println("You have chosen a harsh winter.");
        } else if ((numberOfMonth == 3) || (numberOfMonth == 4) || (numberOfMonth == 5)) {
            System.out.println("You have chosen a blooming spring.");
        } else if ((numberOfMonth == 6) || (numberOfMonth == 7) || (numberOfMonth == 8)) {
            System.out.println("You have chosen a sunny summer.");
        } else if ((numberOfMonth == 9) || (numberOfMonth == 10) || (numberOfMonth == 11)) {
            System.out.println("You have chosen a rainy autumn.");
        } else {
            System.out.println("In fact, the enumeration of months starts from 1 to 12 inclusive, try again!");
        }
    }
}
