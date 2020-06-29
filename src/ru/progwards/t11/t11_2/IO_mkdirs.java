package ru.progwards.t11.t11_2;

import java.io.File;

//Создание цепочки вложенных каталогов
public class IO_mkdirs {
    public static void main(String[] args) {
        File f = new File("E:/Academy/цепь/каталогов/создана/c использованием/mkdirs");

        if(f.mkdirs())
            System.out.println("Цепь каталогов создана");
        else
            System.out.println("Не удалось создать цепь каталогов");
    }
}
