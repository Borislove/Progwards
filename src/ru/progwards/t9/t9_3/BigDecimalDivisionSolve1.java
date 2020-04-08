package ru.progwards.t9.t9_3;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Решение 1: указать scale и RoundingMode
public class BigDecimalDivisionSolve1 {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = BigDecimal.ONE;
        BigDecimal bigDecimal2 = BigDecimal.valueOf(3);
        BigDecimal result = bigDecimal1.divide(bigDecimal2, 5, RoundingMode.HALF_UP);
        System.out.println("result = " + result);
        System.out.println("unscaledValue = " + result.unscaledValue());
        System.out.println("scale = " + result.scale());
    }
}
