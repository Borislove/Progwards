package ru.progwards.t16.t16_1;

import java.util.Date;

public class ExampleDate3 {

    public static void main(String[] args) {
        long uts1 = System.currentTimeMillis()/ 1000L;
        System.out.println(uts1);

        Date now = new Date();
        long uts2 = now.getTime()/1000L;
        System.out.println(uts2);

        long uts3 = 1234567977;
        Date date = new Date(uts3*1000L);
        System.out.println(date);
    }
}
