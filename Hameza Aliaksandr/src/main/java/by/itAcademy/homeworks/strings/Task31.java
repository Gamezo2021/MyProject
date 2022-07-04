package by.itAcademy.homeworks.strings;

/**
 * Задание 31
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
 * один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
 * Сравните скорость их выполнения. Выведите сравнение на экран.
 */

public class Task31 {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        System.gc();
        System.out.println("Время StringBuilder: " + sumStringBuilder(str) + "ms");
        System.gc();
        System.out.println("Время String: " + sumStr(str) + "ms");

    }
    public static long sumStr (String str){
        long time = System.currentTimeMillis();
        String s = str;
        for (int i = 0; i < 100000; i++){
            s = s + str;
        }
        return (System.currentTimeMillis() - time);
    }
    public static long sumStringBuilder(String str){
        long time = System.currentTimeMillis();
        StringBuilder sh = new StringBuilder(str);
        for (int i = 0; i < 100000 ; i++){
            sh.append(str);
        }
        sh.toString();
        return (System.currentTimeMillis() - time);
    }
}
