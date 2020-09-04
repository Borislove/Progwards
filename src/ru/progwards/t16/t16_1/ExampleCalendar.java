package ru.progwards.t16.t16_1;

import java.util.Calendar;
import java.util.Date;

public class ExampleCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(new Date());

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println(Calendar.SUNDAY);
    }
}


//Месяцы нумеруются с 0
//Дни нимеруются с 1
//Дни недели считаются с 1, но первый день недели воскрсенье