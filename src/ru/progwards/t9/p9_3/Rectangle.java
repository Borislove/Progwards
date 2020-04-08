package ru.progwards.t9.p9_3;

import java.math.BigDecimal;

/*Описан класс

 static class Rectangle {

		Rectangle(BigDecimal a, BigDecimal b) {
			this.a = a;
			this.b = b;
		}
		public BigDecimal a;
		public BigDecimal b;
	}

Напишите функцию со спецификацией
 boolean rectCompare(Rectangle r1, Rectangle r2), которая возвращает true если площади прямоугольников равны*/
public class Rectangle {

    Rectangle(BigDecimal a, BigDecimal b) {
        this.a = a;
        this.b = b;
    }

    public BigDecimal a;
    public BigDecimal b;

    boolean rectCompare(Rectangle r1, Rectangle r2) {     //Passed all tests!

        BigDecimal result1 = r1.a.multiply(r1.a);
        BigDecimal result2 = r2.b.multiply(r2.b);

        if (result1.equals(result2)) {
            return true;
        } else return false;
    }

}

