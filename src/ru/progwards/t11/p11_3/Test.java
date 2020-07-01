package ru.progwards.t11.p11_3;


import java.util.Arrays;

/*Реализуйте метод с сигнатурой public String invertWords(String sentence),
 который переставляет слова, в полученной фразе. В качестве исходного разделителя использовать пробел. В качестве соединительного точку.

Например,
invertWords("Буря мглою небо кроет") должен вернуть
"кроет.небо.мглою.Буря"*/
public class Test {


    public String invertWords(String sentence) {

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

        //  System.out.println(out.substring(1));  //c 1 элемента чтение, на 0 стоит точка

        //return Arrays.toString(reverse);
        //  return stringBuilder.toString();
        return out2;
    }


    public static void main(String[] args) {
        Test test = new Test();
        // test.invertWords("Буря мглою небо кроет");
        System.out.println(test.invertWords("Буря мглою небо кроет"));
    }
}
