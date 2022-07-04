package by.itAcademy.homeworks.types;

/** Задать промежуток времени в секундах в виде переменной. Следует вывести его на экран в виде часов минут
 и секунд,суток и недель.
*/
public class Task5 {
    public static void main(String[] args) {
        int sec = 9999999;
        int min = sec/60;
        int hour = sec/3600;
        int day = sec/86400;
        int week = sec/604800;
        int year = sec/31536000;
        System.out.println("Секунд = " + sec + "\n" + "Минут = " + min + "\n" + "Часов = " + hour + "\n" + "Дней = " + day + "\n" + "Недель = " + week + "\n" + "Лет = " +year );
    }
}
