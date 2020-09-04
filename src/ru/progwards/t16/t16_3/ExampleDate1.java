package ru.progwards.t16.t16_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//Получение Date из строки
public class ExampleDate1 {
    public static void main(String[] args) {

        Locale locale = new Locale("ru", "RU");
        SimpleDateFormat format = new SimpleDateFormat("dd-MMMM yyyy'года'", locale);

        try {

            Date date = format.parse("11-декабря 1999 года");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
