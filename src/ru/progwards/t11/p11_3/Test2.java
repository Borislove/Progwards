package ru.progwards.t11.p11_3;

//решение от Влада
public class Test2 {
    public static String invertWords(String sentence) {
        String[] splitted = sentence.split(" "); // разбиваем строку на массив строк, разделитель пробел
        StringBuilder result = new StringBuilder(30); // создаём буфер на 30 символов
        for (int i = splitted.length - 1; i >= 0; i--) {
            result.append(splitted[i]); // переворачиваем массив строк
            if (i>0) result.append("."); // добавляем в качестве разделителя .
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(invertWords("Буря мглою небо кроет"));
    }
}
