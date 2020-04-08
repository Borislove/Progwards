package ru.progwards.t9.t9_3;

import java.math.BigDecimal;
import java.util.Date;

//Тестирование скорости в сравнении с double
public class BigDecimalAndDoubleSpeedTest {
    final static int ITTERATION_COUNT = 100_000_000;

    public static void main(String[] args) {
        long startTime = new Date().getTime();
        BigDecimal result = new BigDecimal(0);
        for (int i = 0; i < ITTERATION_COUNT; i++) {
            result = result.add(new BigDecimal("0.01"));
        }
        System.out.println("BigDecimal: " + (new Date().getTime() - startTime) + " мс, результат: " + result);

        startTime = new Date().getTime();
        double doubleRes = 0.0;
        for (int i = 0; i < ITTERATION_COUNT; i++) {
            doubleRes += 0.01;
        }
        System.out.println("double: " + (new Date().getTime() - startTime) + " мс, результат: " + doubleRes);
    }
}

/*BigDecimal: 2379 мс, результат: 1000000.00
double: 81 мс, результат: 1000000.0007792843*/