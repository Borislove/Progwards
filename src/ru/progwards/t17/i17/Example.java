package ru.progwards.t17.i17;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

//Создайте метод с сигнатурой String createFolder(String name),
// который создает каталог name (один уровень)
// в текущей папке и возвращает полный родителя текущего каталога
public class Example {
    public  static String createFolder(String name){
        new File(name).mkdir();
        Path path = Paths.get(name);
        //System.out.println(path.toAbsolutePath().getParent());
        String str = "" + path.toAbsolutePath().getParent().getParent();
        return str;
    }
}
