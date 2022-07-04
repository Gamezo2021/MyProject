package by.itAcademy.homeworks.objects;

public class Time24task implements Comparable<Time24task> {
    public int seconds;
    public int minutes;
    public int hours;

    // Конструктор получающий секунды,минуты,часы.
    public Time24task(int seconds, int minutes, int hours) {
    this.seconds = seconds;
    this.minutes = minutes;
    this.hours = hours;
    }
    // Констуктор для получения секунд.
    public Time24task(int seconds){
        this.seconds = seconds;
        this.minutes = seconds/60;
        this.hours = seconds/3600;
    }
    // Метод для получения полного колличества секунд в объекте
    public int getSeconds(){
        int sec = seconds + (minutes * 60) + (hours * 3600);
        return sec;
    }
    // Метод для сравнения двух объектов
    public int compareTo(Time24task O) {
        int seconds = getSeconds();
        int secondsInO = O.getSeconds();
        if (seconds > secondsInO) {
            return 1;
        }
        else if (seconds < secondsInO) {
            return -1;
        }
        else {
            return 0;
        }
    }
    // Метод для вывода информации
    public void printTime(){
     System.out.println("Time24task " + seconds + "Секунд " + minutes + "Минут" + hours + "Часов");
    }
}