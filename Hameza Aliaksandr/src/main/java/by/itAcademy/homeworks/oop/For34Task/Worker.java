package by.itAcademy.homeworks.oop.For34Task;

public class Worker implements SalaryCalculation{
    private float salary;
    private float houseWorked;
    private int numberOfPartsProduced;
    private float partPrice;
    private float wage;
    private float workingHoursPerMon = 188;

    public Worker(float salary, float houseWorked, int numberOfPartsProduced, float partPrice){
        this.salary = salary;
        this.houseWorked = houseWorked;
        this.numberOfPartsProduced = numberOfPartsProduced;
        this.partPrice = partPrice;
    }
    @Override
    public float salaryCalculation (){
        wage = salary * ( houseWorked / workingHoursPerMon) + numberOfPartsProduced + partPrice;
        return wage;
    }
    public String toString(){
        return "Рабочему начислено " + wage;
    }
}
