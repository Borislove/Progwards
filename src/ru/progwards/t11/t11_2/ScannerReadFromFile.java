package ru.progwards.t11.t11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Чтение из файла при помощи сканера
public class ScannerReadFromFile {
    public static void main(String[] args) {
        File file = new File("E:\\JAVA\\git.txt");
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                System.out.println(str);

            }
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
