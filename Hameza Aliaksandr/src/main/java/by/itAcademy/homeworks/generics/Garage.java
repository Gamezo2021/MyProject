package by.itAcademy.homeworks.generics;

public class Garage <T extends Vehicle>{
    private T vehicle;
    public T getVehicle(){
        return vehicle;
    }
    public void putInto(T o ){ vehicle = o ;};
}
