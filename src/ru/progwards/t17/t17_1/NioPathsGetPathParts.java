package ru.progwards.t17.t17_1;

import java.nio.file.Path;
import java.nio.file.Paths;

//Получение частей пути
public class NioPathsGetPathParts {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:/Projects/Academy/Java1");

        System.out.println("path1: "+path1);
        System.out.println("getFileName(): "+path1.getFileName()); //самый правый элемент
        System.out.println("getNameCount: "+path1.getNameCount()); //возврат количество элементов в пути
        System.out.println("getName(0): "+path1.getName(0)); //возвращает элементы пути без корневого
        System.out.println("getName(1): "+path1.getName(1));
        System.out.println("getName(2): "+path1.getName(2));

        System.out.println("subpath(0, 1): "+path1.subpath(0,1));
        System.out.println("subpath(1, 3): "+path1.subpath(1,3));
        System.out.println("getRoot: "+path1.getRoot());
        System.out.println("getParent: "+path1.getParent());

    }
}
