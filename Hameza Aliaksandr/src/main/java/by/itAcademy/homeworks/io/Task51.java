package by.itAcademy.homeworks.io;

import java.io.*;

/**
 * Задание 51
 * Создать объект Person c полями name, surname, age.
 * Сгенерировать 10 объектов класса Person со случайными полями соответствующего типа.
 * С помощью Java создать файл, в который запишется информация о этих людях.
 */

public class Task51 {
    public static void main(String[] args) throws IOException {
        File file = new File("Hameza Aliaksandr\\src\\main\\resources\\ForTask51");
        file.createNewFile();
        try (FileWriter writer = new FileWriter("Hameza Aliaksandr\\src\\main\\resources\\ForTask51")){
            writer.write("");
            writer.flush();
        }
        catch (FileNotFoundException){
            System.out.println("Файл не найден");
        }
        createAndWrite(new Person("Vasia1" , "vova1",21));
        createAndWrite(new Person("Vasia2","vova2",22);
        createAndWrite(new Person("Vasia3","vova3",23);
        createAndWrite(new Person("Vasia4","vova4",24);
        createAndWrite(new Person("Vasia5","vova5",25);
        createAndWrite(new Person("Vasia6","vova6",26);
        createAndWrite(new Person("Vasia7","vova7",27);
        createAndWrite(new Person("Vasia8","vova8",28);
        createAndWrite(new Person("Vasia8","vova9",29);
        createAndWrite(new Person("Vasia10","vova10",30);

    }
    public static void createAndWrite(Person person) throws IOException{
        try (FileWriter writer = new FileWriter("Hameza Aliaksandr\\src\\main\\resources\\ForTask51")){
            writer.write(person.toString());
            writer.flush();
        }
        catch (FileNotFoundException){
            System.out.println("Файл не найден");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
