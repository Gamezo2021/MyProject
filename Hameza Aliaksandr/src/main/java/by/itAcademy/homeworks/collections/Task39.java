package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Задание 39
 * Создать список оценок учеников с помощью ArrayList,
 * заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 */

public class Task39 {
    public static void main(String[] args) {
        int numberOfStudent = 20;
        ArrayList<Integer> assessment = new ArrayList<>();
        fillArray(assessment, numberOfStudent);
        System.out.println("Оценки по умолчанию " + assessment);
        System.out.println("Удовлетворительные оценки " + deleteBadAssement(assessment));
    }
    public static ArrayList<Integer> fillArray(ArrayList<Integer> assessment, int numberOfStudent){
        for (int i = 0; i <= numberOfStudent; i++){
            assessment.add((int) (Math.random() * 11));
        }
        return assessment;
    }
    public static ArrayList<Integer> deleteBadAssement(ArrayList<Integer> assesment){
        ArrayList<Integer> assementNew = new ArrayList<>();
        for (int i = 0; i < assesment.size() - 1; i++){
            if (assesment.get(i) > 3){
                assementNew.add(assesment.get(i));
            }
        }
        return assementNew;

    }
}
