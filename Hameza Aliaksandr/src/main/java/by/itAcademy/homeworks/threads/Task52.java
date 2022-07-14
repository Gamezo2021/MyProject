package by.itAcademy.homeworks.threads;

/**
 * Задание 52
 * Создать 10 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 10 случайных целых чисел и выводит на экран.
 */

public class Task52 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Thread t = new Thread();
            t.setName("Поток " + i);
            t.start();
        }
    }
    public static void 
}
