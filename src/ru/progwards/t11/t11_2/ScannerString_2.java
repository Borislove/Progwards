package ru.progwards.t11.t11_2;

import java.util.Scanner;

//Сканирование строк и чисел
public class ScannerString_2 {
    public static void main(String[] args) {
        String str = "Эта строка состоит из 5 слов";

        try (Scanner scanner = new Scanner(str)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    System.out.println("Число " + num);
                } else {
                    String word = scanner.next();
                    System.out.println("Слово " + word);
                }
            }
        }
    }
}
