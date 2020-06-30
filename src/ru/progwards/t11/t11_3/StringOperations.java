package ru.progwards.t11.t11_3;

import java.sql.SQLOutput;

//Некоторые операции со строками
public class StringOperations {
    public static void main(String[] args) {

        //               012345678901234567
        String regNum = "    a123aK 177   ";

        System.out.println(regNum.toUpperCase()); //перевод всей строки в верхний регистр
        System.out.println(regNum.toLowerCase()); //перевод всей строки в нижний регистр
        System.out.println(regNum.replace(" ", ""));  //замена, старая подстрока и новая
        System.out.println(regNum.trim()); //убирает начальные пробелы и после окончания строки
        System.out.println(regNum.indexOf("123")); //ищет подстроку и возвращает позицию
        System.out.println(regNum.substring(5)); //вывести подстроку с 5 индекса до конца строки
        System.out.println(regNum.substring(5, 8)); //вывести от и до
    }
}
