package ru.progwards.t11.p11_3;

public class Test3 {

    public String invertWords1(String sentence) {
        String[] str = sentence.split(" ");   //запихнул в массив
        String[] reverse = new String[str.length];  //копия
        StringBuilder stringBuilder = new StringBuilder();
        //реверс массива
        for (int i = 0; i < str.length; i++) {
            reverse[i] = str[str.length - 1 - i];
            stringBuilder.append("." + reverse[i]);  //добавили точку в конце каждого слова
        }
        String out = stringBuilder.toString();   //преобразование из билдера в строчку
        String out2 = out.substring(1);
        return out2;
    }

    public static String invertWords2(String sentence) {
        String[] splitted = sentence.split(" "); // разбиваем строку на массив строк, разделитель пробел
        StringBuilder result = new StringBuilder(30); // создаём буфер на 30 символов
        for (int i = splitted.length - 1; i >= 0; i--) {
            result.append(splitted[i]); // переворачиваем массив строк
            if (i > 0) result.append("."); // добавляем в качестве разделителя .
        }
        return result.toString();
    }

    public static void main(String[] args) {

        Test3 test3 = new Test3();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            test3.invertWords1("один два три четыре пять шесть семь восемь девять десять");
        }
        long end = System.currentTimeMillis();
        System.out.println("Продолжительность вычислений: " + (end - start) + "миллисекунд");

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            test3.invertWords2("один два три четыре пять шесть семь восемь девять десять");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Продолжительность вычислений: " + (end2 - start2) + "миллисекунд");
    }
}
