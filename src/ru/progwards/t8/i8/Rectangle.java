package ru.progwards.t8.i8;

/*Описан класс

	class Rectangle {
		private double a;
		private double b;

		public Rectangle(double a, double b) {
		        this.a = a;
			this.b = b;
                 }

		public double area() {

			return a*b;
		}
}

переопределите метод equals с сигнатурой
public boolean equals(Object anObject) который должен сравнивать прямоугольники по величине их площади.

Например

прямоугольник 2x2 != прямоугольнику 1x1
прямоугольник 2x3 == прямоугольнику 3x2*/

import java.util.Objects;

public class Rectangle {

        private double a;
        private double b;

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double area() {

            return a*b;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.area(), area()) == 0 &&
                Double.compare(rectangle.area(), area()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

