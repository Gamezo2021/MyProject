package by.itAcademy.homeworks.io;

import java.io.*;

/**
 * Задание 49
 * Записать с помощью Java в двоичный файл 20 случайных чисел.
 * Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.
 */

public class Task49 {
    public static void main(String[] args) throws IOException {
        write();
        read();
    }
    public static void write() {
        DataOutputStream output;
        try {
            output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Hameza Aliaksandr\\src\\main\\resources\\for49")));
            for (int i = 0 ; i < 20 ; i++){
                output.writeInt((int)(Math.random()* 100));
            }
            output.flush();
            output.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void read()throws IOException {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("Hameza Aliaksandr\\src\\main\\resources\\for49")));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: ");
            return;
        }
        int res = dataInputStream.readInt();
        int sum = 0;
        int ravareg;
        System.out.println("Прочитано из файла");
        while (true) {
            System.out.println(res + "");
            sum = sum + res;
            try {
                res = dataInputStream.readInt();
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
        if (dataInputStream != null) {
            dataInputStream.close();
        }
        ravareg = sum / 20;
        System.out.println("Среднее арифмитическое :" + ravareg);
    }
}
