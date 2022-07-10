package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Задание 40
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.
 */

public class Task40 {
    public static void main(String[] args) {
        int arrayObject = 10;
        ArrayList<Integer> array = new ArrayList<>();
        fillArray(array, arrayObject);
        System.out.println("Исходный массив: " + array);
        System.out.println("Уникальный массив: " + deleteRecurring(array));


    }
    public static ArrayList<Integer> fillArray(ArrayList<Integer> array, int arrayObject){
        for (int i = 0 ; i <= arrayObject ; i++){
            array.add((int) (Math.random() * 11));
        }
        return array;
    }
    public static ArrayList<Integer> deleteRecurring (ArrayList<Integer> array){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i <= array.size() - 1; i++) {
            if (!newArray.contains(array.get(i))) {
                newArray.add(array.get(i));
            }
        }
            return newArray;
    }
}
