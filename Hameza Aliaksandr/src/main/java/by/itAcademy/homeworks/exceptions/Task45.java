package by.itAcademy.homeworks.exceptions;

/** Написать метод, который будет возбуждать исключение и обработать это исключение на уровне выше.
 * Результат работы программы вывести на экран.
 */

public class Task45 {
    public static void main(String[] args) {
        try {
            System.out.println(divisionbyzero());
        }
        catch (Exception exc){
            System.out.println("Ошибочка");
            exc.printStackTrace();
        }
        System.out.println("Продолжаем работать");
    }
    public static int divisionbyzero () throws Exception{
         int result = 13/0;
         return result;
    }
}
