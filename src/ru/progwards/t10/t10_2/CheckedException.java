package ru.progwards.t10.t10_2;

import java.io.FileWriter;
import java.io.IOException;

//Проверяемое исключение в try-catch
public class CheckedException {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("?????", false);
            //какой-то код...
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
