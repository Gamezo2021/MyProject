package by.itAcademy.homeworks.exceptions;

/**
 * Задание 43
 * Написать код, который выбрасывает NullPointerException.
 * Написать обработчик этого исключения и вывести на экран сообщение, которое будет содержать описание данного исключения.
 */

public class Task43 {
    public static void main (String[] args) {
        Integer a = null;
        try {
            int x = a * 10 ;
        } catch (NullPointerException exc){
            System.out.println("На ноль делить нельзя");
            exc.printStackTrace();
        }
        finally {
            System.out.println("Этот блок выполняется всегда");
        }
        System.out.println("Работаем дельше");
    }
}
