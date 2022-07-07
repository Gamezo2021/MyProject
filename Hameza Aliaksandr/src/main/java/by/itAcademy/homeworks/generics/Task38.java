package by.itAcademy.homeworks.generics;

import java.util.Scanner;

/**
 * Задание 38
 * Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
 * Создать поле name в классе Vehicle и проинициализировать его через конструктора.
 * Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
 * Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.
 */

public class Task38 {
    public static void main(String [] args){
        System.out.println("Введите имя машины: ");
        Scanner scan = new Scanner(System.in);
        String carName = scan.next();
        Garage<Car> garageForCar = new Garage<>();
        garageForCar.putInto(new Car(carName));
        System.out.println("Введите имя мотоцикла: ");
        Scanner scan1 = new Scanner(System.in);
        String motoName = scan1.next();
        Garage<Motorcycle> garageForMoto = new Garage<>();
        garageForMoto.putInto(new Motorcycle(motoName));
        System.out.println("Автомобиль " + garageForCar.getVehicle().toString() + "\n" + "Мотоцикл " + garageForMoto.getVehicle().toString());
    }
}
