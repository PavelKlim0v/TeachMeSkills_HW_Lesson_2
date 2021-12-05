package ManagementStructures;

import java.util.Scanner;

/**
 *  Задание 1.
 *    Написать программу для вывода названия поры года по номеру месяца.
 * 	  При решении используйте оператор switch-case.
 */

public class Task1 {

    public void taskMS1() {
        System.out.println("Enter the month number.");
        Scanner scan = new Scanner(System.in);
        byte numberOfMonth = scan.nextByte();

        switch (numberOfMonth) {
            case 12 : case 1 : case 2 :
                System.out.println("You have chosen a harsh winter.");
                break;
            case 3 : case 4 : case 5 :
                System.out.println("You have chosen a blooming spring.");
                break;
            case 6 : case 7 : case 8 :
                System.out.println("You have chosen a sunny summer.");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("You have chosen a rainy autumn.");
                break;
            default:
                System.out.println("In fact, the enumeration of months starts from 1 to 12 inclusive, try again!");
        }
    }
}
