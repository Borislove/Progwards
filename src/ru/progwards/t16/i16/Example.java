package ru.progwards.t16.i16;


import java.util.Calendar;
import java.util.Date;

//Напишите метод с сигнатурой Date createDate(), который возвращает дату - 28 февраля 1986, 0 часов, 0 минут, 0 секунд, 0 миллисекунд
public class Example {

    Date createDate() {
        //   Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1986, 1, 28, 0, 0, 0);
        // System.out.println(calendar.getTime());
        //  System.out.println(calendar);
        return calendar.getTime();
    }

    public static void main(String[] args) {

        Example example = new Example();
        //    example.createDate();
        System.out.println(example.createDate());
    }
}
