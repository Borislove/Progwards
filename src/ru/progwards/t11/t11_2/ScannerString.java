package ru.progwards.t11.t11_2;

import java.util.Scanner;

//Сканирование строк
public class ScannerString {
    public static void main(String[] args) {
        String str = "Эта строка состоит из 5 слов";

        try(Scanner scanner = new Scanner(str)){
            while (scanner.hasNextLine()){
                String word = scanner.next();
                System.out.println("Слово "+word);
            }
        }
    }
}
