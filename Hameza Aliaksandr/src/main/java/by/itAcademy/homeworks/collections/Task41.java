package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Задание 41
 * Создать список оценок учеников с помощью ArrayList,
 * заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
 */

public class Task41 {
    public static void main(String[] args) {
        int numberOfStudent = 20;
        ArrayList<Integer> assessment = new ArrayList<>();
        fillArray(assessment, numberOfStudent);
        System.out.println("Исходный список оценок: " + assessment);
        System.out.println("Максимальная оценка: " + maxAssessment(assessment));

    }
    public static ArrayList<Integer> fillArray(ArrayList<Integer> assessment, int numberOfStudent){
        for (int i = 0 ; i <= numberOfStudent ; i++){
            assessment.add((int) (Math.random() * 11));
        }
        return assessment;
    }
    public static int maxAssessment(ArrayList<Integer> assessment){
        int maxAssessment = assessment.get(0);
        Iterator<Integer> iterator = assessment.iterator();
        while (iterator.hasNext()){
           int i = iterator.next();
           if (i > maxAssessment){
               maxAssessment = i;
           }
        }
        return maxAssessment;


    }
}
