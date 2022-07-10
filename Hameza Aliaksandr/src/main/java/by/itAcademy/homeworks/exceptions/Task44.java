package by.itAcademy.homeworks.exceptions;

import java.util.Scanner;

/** Написать собственное исключение от Exception. Сгенерировать код, который будет выбрасывать его и обрабатывать.
 * Результат работы программы вывести на экран.
 */
public class Task44 {
    public static void main(String[] args) {
        System.out.println("Введите число первое; ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите второе чило: ");
        Scanner scan1 = new Scanner(System.in);
        int b = scan1.nextInt();
        try {
            int result = multiplication(a , b);
            System.out.println(a + "*" + b +"= " + result);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static int multiplication(int a, int b) throws Exception {
        if (a == 0) {
            throw new Exception("Умножение на ноль невозможно");
        }
        if (b == 0) {
            throw new Exception("Так тоже нельзя");
        }
        int result = a * b;
        return result;
    }
}