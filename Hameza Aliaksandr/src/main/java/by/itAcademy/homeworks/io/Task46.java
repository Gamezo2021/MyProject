package by.itAcademy.homeworks.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/** Вывести список файлов и каталогов выбранного каталога на диске.
 * Файлы и каталоги должны быть распечатаны отдельно.
 */

public class Task46 {
    public static void main(String[] args) {
        File path = new File("D:\\World of Warcraft");
        System.out.println("Список каталогов:" + "\n");
        displayListDirectiry(path);
        System.out.println("\n" + "Список файлов:" + "\n");
        displayListFile(path);

    }
    public static void displayListDirectiry(File path){
        for (File file : path.listFiles()) {
            if (file.isDirectory()){
                System.out.println(file.getName());
            }
        }
    }
    public static void displayListFile(File path){
        for (File file : path.listFiles()){
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}
