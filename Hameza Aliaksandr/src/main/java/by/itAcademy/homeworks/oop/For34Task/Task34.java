package by.itAcademy.homeworks.oop.For34Task;

/**
 * Задание 34
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе.
 * Реализовать методы по начислению зарплаты в зависимости от должности (почасовая, процентная, смешанная).
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Task34 {
    public static void main (String [] args){
        DeputyForProduction deputyForProduction = new DeputyForProduction(1310,242,200,50);
        deputyForProduction.salaryCalculation();
        System.out.println(deputyForProduction.toString());
        Master master = new Master(1730,130,200,60);
        master.salaryCalculation();
        System.out.println("Мастеру начислено " + master.salaryCalculation());
        Worker worker = new Worker(1000,200,140,200);
        worker.salaryCalculation();
        System.out.println(worker.toString());
    }
}
