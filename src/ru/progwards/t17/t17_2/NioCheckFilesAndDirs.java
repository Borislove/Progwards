package ru.progwards.t17.t17_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Класс Files: информация о файле или каталоге
public class NioCheckFilesAndDirs {
    public static void main(String[] args) throws IOException {
        Path pathName = Paths.get("C:/Projects/Academy/Java1/file1.txt");

        System.out.println("exists: "+ Files.exists(pathName));
        System.out.println("notExists: "+Files.notExists(pathName)); //несуществует
        System.out.println("isReadable: "+Files.isReadable(pathName)); //можно ли читать?
        System.out.println("isWritable:"+Files.isWritable(pathName) ); //можно ли записывать?
        System.out.println("isDirectory: "+ Files.isDirectory(pathName));
        System.out.println("isRegularFile: "+Files.isRegularFile(pathName)); //нормальный ли файл? *системные
        System.out.println("isHidden: "+Files.isHidden(pathName)); //скрытый
        System.out.println("isExecutable: "+Files.isExecutable(pathName)); //исполняемый?
    }
}
