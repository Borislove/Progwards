package ru.progwards.t6.i6;

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
реализуйте метод compareTo с сигнатурой
public int compareTo(Rectangle anRectangle) который должен сравнивать прямоугольники по величине их площади.
При сравнении a.compareTo(b) метод должен возвращать
a   > b : 1
a == b : 0
a   < b : -1

Например
прямоугольник 2x2  >  прямоугольника 1x1 - результат 1
прямоугольник 2x3 == прямоугольнику 3x2 - результат 0
прямоугольник 2x2  <  прямоугольника 3x3 - результат -1*/

public class Rectangle {  //Passed all tests!
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public int compareTo(Rectangle anRectangle) {
      /*  if (area() > (anRectangle.a * anRectangle.b)) {
            return 1;
        } else if ((area()) == (anRectangle.a * anRectangle.b)) {
            return 0;
        } else {
            return -1;
        }*/

    return Double.compare(area(), anRectangle.a * anRectangle.b);
    }


    public static void main(String[] args) {
        new Rectangle(20, 3).compareTo(new Rectangle(20, 20));
    }
}
