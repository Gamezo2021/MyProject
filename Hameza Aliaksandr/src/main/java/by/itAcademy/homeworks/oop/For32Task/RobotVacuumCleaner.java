package by.itAcademy.homeworks.oop.For32Task;

public class RobotVacuumCleaner extends VacuumCleaner implements Appliances {
    private boolean needCarging;
    private float batteryCapacity;

    public RobotVacuumCleaner(boolean isOn, String model, String brand, boolean needCarging, float batteryCapacity, float bagCapacity, int power) {
        super(isOn, model, brand, power, bagCapacity);
        this.needCarging = needCarging;
        this.batteryCapacity = batteryCapacity;
    }

    public void isNeedCarging() {
        if (needCarging = true) {
            System.out.println("Нужно зарядить робот-пылесос");
        }
        else {
            System.out.println("Робот-пылесос заряжен");
        }
    }

    public float getBatteryСapacity() {
        return batteryCapacity;
    }

    public void printInfo() {
        turnOn();
        System.out.println("Робот-пылесос");
        System.out.println("Брэнд: " + getBrand());
        System.out.println("Модель: " + getModel());
        System.out.println("Объём пылесборника: " + getBagCapasity() + " л.");
        System.out.println("Мощность: " + getPower() + " Вт");
        System.out.println("Ёмкость аккумулятора: " + getBatteryСapacity() + " mAh");
        isNeedCarging();
        System.out.println("\n");
    }
}
