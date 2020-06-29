package ru.progwards.t11.t11_2;

import java.io.File;
import java.util.Date;

//Информация о файле или каталоге
public class SimpleFileInfo {
    public static void main(String[] args) {
        File fileInfo = new File("E:\\JAVA\\git.txt");
        System.out.println("exist: " + fileInfo.exists());   //существует ли файл или каталог?
        System.out.println("canExecute: " + fileInfo.canExecute()); //является ли исполняемым?
        System.out.println("lastModified: " + new Date(fileInfo.lastModified())); //информация о последнем изменение
        System.out.println("lenght: " + fileInfo.length()); //размер в байтах
        System.out.println("getParent: " + fileInfo.getParent()); //родительский каталог
        System.out.println("getPath: " + fileInfo.getPath()); //полный маршрут
        System.out.println("getName: " + fileInfo.getName()); //имя
        System.out.println("isDirectory: " + fileInfo.isDirectory());
        System.out.println("isFile: " + fileInfo.isFile()); //это файл*
        System.out.println("isHidden: " + fileInfo.isHidden()); //скрытый
    }
}
