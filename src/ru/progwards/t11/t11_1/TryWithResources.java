package ru.progwards.t11.t11_1;

import java.io.FileWriter;
import java.io.IOException;

//Блоки catch и finally in try - with - resources
public class TryWithResources {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("???", false)) {

            //какой-то код...
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            //какой-то код...
        }
    }
}
