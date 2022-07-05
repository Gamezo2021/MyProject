package by.itAcademy.homeworks.oop.For34Task;

public class DeputyForProduction implements SalaryCalculation{
    private float salaary;
    private float houseWorked;
    private float premium;
    private float planCompletionPercentage;
    private float wage;
    private float workingHousePerMon = 133;
    public DeputyForProduction(float salary, float houseWorked, float premium, float planCompletionPercentage){
        this.salaary = salary;
        this.houseWorked = houseWorked;
        this. premium = premium;
        this.planCompletionPercentage = planCompletionPercentage;
    }
    @Override
    public float salaryCalculation(){
        wage = salaary * ( houseWorked / workingHousePerMon) + premium + (planCompletionPercentage * 100);
        return wage;
    }
    public String toString(){
        return "Начальнику участка начислено " + wage;
    }
}
