package ru.progwards.t9.t9_3;

import java.math.BigDecimal;

public class BigDecimalDivisionException {
    public static void main(String[] args) {
        BigDecimal bigDec1 = new BigDecimal(1);
        BigDecimal bigDec2 = BigDecimal.valueOf(3);
        BigDecimal result = bigDec1.divide(bigDec2);

        /*Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
	at java.base/java.math.BigDecimal.divide(BigDecimal.java:1722)
	at ru.progwards.t9.t9_3.BigDecimalDivisionException.main(BigDecimalDivisionException.java:9)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:567)
	at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)*/

        System.out.println("result = " + result);
        System.out.println("unscaledValue = " + result.unscaledValue());
        System.out.println("scale = " + result.scale());
    }
}
