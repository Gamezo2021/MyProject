package by.itAcademy.homeworks.oop.For32Task;

public class ElectricBroom extends AbstractAppliances{
    private int battaryCapacity;
    private boolean needCarging;
    private float tankCapacity;

    public ElectricBroom (boolean isOn, String model, String brand, int battaryCapacity, boolean needCarging, float tankCapacity) {
        super(isOn, brand, model);
        this.battaryCapacity = battaryCapacity;
        this.needCarging = needCarging;
        this.tankCapacity = tankCapacity;
    }
    public int getBattaryCapacity(){
        return battaryCapacity;
    }
    public void isNeedCarging(){
        if (this.needCarging == true){
            System.out.println("Нужно зарядить");
        }
        else{
            System.out.println("Заряжено");
        }
    }
    public float getTankCapacity() {
        return tankCapacity;
    }
    public void printInfo(){
        turnOn();
        System.out.println("Бренд " + getBrand());
        System.out.println("Модель " + getModel());
        System.out.println("Емкость батареи " + getTankCapacity());
        isNeedCarging();
        System.out.println("Емкость бака " + getBattaryCapacity());
    }
}
