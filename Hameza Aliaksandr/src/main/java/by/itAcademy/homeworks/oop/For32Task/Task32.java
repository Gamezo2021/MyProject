package by.itAcademy.homeworks.oop.For32Task;

/**
 * Задание 32
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Task32 {
    public static void main (String [] args){
        VacuumCleaner vacuumCleaner = new VacuumCleaner(true, "Samsung ", "Bkwajdlw324" , 1600, 1200);
        vacuumCleaner.printInfo();
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner(false, "Nokia" , "wdaawdawd21", true , 66756,5765, 65756);
        robotVacuumCleaner.printInfo();
        ElectricBroom electricBroom = new ElectricBroom(true, "wdadwa", "jawdnjkawd2134", 123123,false,312132);
        electricBroom.printInfo();

    }
}
