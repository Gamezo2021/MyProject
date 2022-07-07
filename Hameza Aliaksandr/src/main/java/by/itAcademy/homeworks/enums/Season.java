package by.itAcademy.homeworks.enums;

public enum Season {
    WINTER(90,"Зима"),
    SPRING(92,"Весна"),
    SUMMER(92,"Лето"),
    AUTUMN(91,"Осень");

    private int countOfDays;
    private String description;

   Season (int countOfDays, String description){
        this.countOfDays = countOfDays;
        this.description = description;
    }
    public int getCountOfDays(){
        return countOfDays;
    }
    public String getDescription(){
        return description;
    }
    public static String infoOutPut(Season season){
        return "Сезон " + season + " Описание " + season.getDescription() + " Колличество дней " + season.getCountOfDays();
    }
    public static Season nextSeason(Season season){
       switch (season){
           case WINTER:
               return SPRING;
           case SPRING:
               return SUMMER;
           case SUMMER:
               return AUTUMN;
           case AUTUMN:
                return WINTER;
       }
       return null;
    }
}
