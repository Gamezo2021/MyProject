package by.itAcademy.homeworks.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Задание 50
 * Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
 * Заполнить их 10 произвольными целыми числами. Содержимое файлов записать в один файл в том же каталоге.
 * Создать файл, который будет содержать список файлов данного каталога.
 */

public class Task50 {
    private static String path = "Hameza Aliaksandr\\src\\main\\resources\\Task50\\";
    public static void main(String[] args) throws Exception {
        new File(path).mkdirs();
        makeFile();
        generationAndWrite();
        readAndWrite();
        makeCatalog();
    }
    public static void makeFile() throws Exception {
        for (int i = 0; i <= 5; i++) {
            File file = new File(path + "FIle" + i + ".txt");
            file.createNewFile();
        }
    }
    public static void generationAndWrite(){
        for (int i = 0; i <=5 ; i++){
            try (FileWriter writer = new FileWriter(path + "FIle" + i + ".txt")){
                    int [] array = new int[10];
                    for (int j = 0; j < array.length; j++){
                        array[j] = (int)(Math.random()*10);
                    }
                    writer.write(Arrays.toString(array));
                    writer.flush();
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
        public static void readAndWrite() throws IOException {
            File file = new File(path + "FromPrevious5.txt");
            file.createNewFile();
            char[] array = new char[256];
            int c;
            String str = "";
            String string = "";
            for (int i = 0; i <= 5; i++) {
                try (FileReader reader = new FileReader(path + "FIle" + i + ".txt")) {
                    while ((c = reader.read(array)) > 0) {
                        str = String.valueOf(Arrays.copyOf(array, c));
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                string = string + str;
            }
            try (FileWriter writer = new FileWriter(path + "FromPrevious5.txt")) {
                writer.write(string);
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        public static void makeCatalog(){
        File file = new File(path);
        try (FileWriter writer = new FileWriter(path + "Catalog.txt")) {
            for (File f : file.listFiles()){
                try {
                    writer.write(f.getName() + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
