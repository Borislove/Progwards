package ru.progwards.t16.t16_2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

//ZoneId - часовой пояс
public class ExampleZoneId {
    public static void main(String[] args) {

        ZoneId zid1 = ZoneId.of("Europe/Moscow");
        System.out.println(zid1.getRules().getOffset(Instant.now()));
        System.out.println(zid1.getRules().isDaylightSavings(Instant.now()));

        ZoneId zid2 = ZoneId.of("UTC+4");
        System.out.println(zid2.getDisplayName(TextStyle.FULL, Locale.getDefault()));

        ZoneId zid3 = ZoneId.of("+03:00:00");
        System.out.println(zid3.getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }
}
