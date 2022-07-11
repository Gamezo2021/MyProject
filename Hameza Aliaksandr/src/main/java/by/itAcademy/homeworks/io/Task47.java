package by.itAcademy.homeworks.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 47
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов. Вывести результат на экран.
 */

public class Task47 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\Новый текстовый документ.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder text = new StringBuilder();
        String str = bufferedReader.readLine();
        while (str != null) {
            text.append(str);
            str = bufferedReader.readLine();
        }
            System.out.println("Знаков препинания: " + findPunctuationMarks(text));
            System.out.println("Слов : " + findWords(text));
        }
        public static int findPunctuationMarks(StringBuilder str){
        int count = 0;
            Pattern pattern = Pattern.compile("([!?]+|\\.{3}|[,;:\"'().—]\\s?)");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()){
                count++;
            }
            return count;
        }
        public static int findWords(StringBuilder str){
        return str.toString().split("([!?]+|\\.{3}|[,;:\"'().—]\\s?)").length;
    }
}
