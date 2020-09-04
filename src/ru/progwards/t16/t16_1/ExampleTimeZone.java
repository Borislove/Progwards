package ru.progwards.t16.t16_1;

import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

public class ExampleTimeZone {
    public static void main(String[] args) {

        TimeZone tz = TimeZone.getTimeZone("Europe/Moscow");

        System.out.println(tz.getRawOffset());
        System.out.println(tz.getOffset(System.currentTimeMillis()));
        System.out.println(tz.useDaylightTime());

        Locale locale = new Locale("ru", "RU");
        System.out.println(tz.getDisplayName(false, TimeZone.LONG, locale)); //длинное имя
        System.out.println(tz.getDisplayName(false, TimeZone.SHORT, locale)); //короткое

        String[] zones = TimeZone.getAvailableIDs();
        System.out.println(zones.length);
        System.out.print(Arrays.toString(zones));
    }
}
