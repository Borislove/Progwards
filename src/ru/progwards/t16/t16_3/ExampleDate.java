package ru.progwards.t16.t16_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Получение Date из строки
//время будет забита 0, так же и дата
public class ExampleDate {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = format.parse("11/11/2222");
            System.out.println(date);
            Date date2 = format.parse("30/02/2222");
            System.out.println(date2);
            Date date3 = format.parse("35/13/2222");
            System.out.println(date3);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
