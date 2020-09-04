package ru.progwards.t17.t17_1;

import java.io.File;
import java.util.Date;

//java.io.File: информация о файле или каталоге
public class SimpleFileInfo {
    public static void main(String[] args) {

        File fileInfo = new File("C:/Projects/Academy/Java1/Java1.iml");
        System.out.println("exists: " + fileInfo.exists()); //существует ли?
        System.out.println("canExecute: " + fileInfo.canExecute()); //
        System.out.println("lastModified: " + new Date(fileInfo.lastModified())); //время последнего изменения
        System.out.println("lenght: " + fileInfo.length()); //длина в байтах
        System.out.println("getParent: " + fileInfo.getParent()); //родительский каталог
        System.out.println("getPath: " + fileInfo.getPath()); //полная строка
        System.out.println("getName: " + fileInfo.getName()); //сам объект
        System.out.println("isDirectory: " + fileInfo.isDirectory()); //это каталог?
        System.out.println("isFile: " + fileInfo.isFile()); //это файл?
        System.out.println("isHidden: " + fileInfo.isHidden()); //объект скрытый ли в файловой системе?
    }
}
