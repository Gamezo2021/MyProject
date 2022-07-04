package by.itAcademy.homeworks.oop.For32Task;

public class VacuumCleaner extends AbstractAppliances {
    private int power;
    private float bagCapasity;

    public VacuumCleaner(boolean isOn, String brand, String model, int power, float bagCapasity) {
        super(isOn, brand, model);
        this.bagCapasity = bagCapasity;
        this.power = power;
    }
    public float getBagCapasity(){
        return bagCapasity;
    }
    public int getPower(){
        return power;
    }
    public void printInfo() {
        turnOn();
        System.out.println("Пылесос");
        System.out.println("Брэнд: " + getBrand());
        System.out.println("Модель: " + getModel());
        System.out.println("Объём пылесборника: " + getBagCapasity() + " л.");
        System.out.println("Мощность: " + getPower() + " Вт" + "\n");
    }
}
