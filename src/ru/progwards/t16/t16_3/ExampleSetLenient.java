package ru.progwards.t16.t16_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//setLenient() - установить снисходительность
public class ExampleSetLenient {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        try {
            Date date1 = format.parse("35/13/2222");
            System.out.println(date1);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
