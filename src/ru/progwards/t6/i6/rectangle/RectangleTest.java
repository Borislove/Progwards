package ru.progwards.t6.i6.rectangle;

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
*/

//Passed all tests!
public class RectangleTest {

    private double a;
    private double b;

    public RectangleTest(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*реализуйте метод compareTo с сигнатурой
    public int compareTo(Rectangle anRectangle) который должен сравнивать прямоугольники по величине их площади.
    При сравнении a.compareTo(b) метод должен возвращать
    a   > b : 1
    a == b : 0
    a   < b : -1

    Например

    прямоугольник 2x2  >  прямоугольника 1x1 - результат 1
    прямоугольник 2x3 == прямоугольнику 3x2 - результат 0
    прямоугольник 2x2  <  прямоугольника 3x3 - результат -1*/
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int compareTo(Rectangle rectangle) {

        if (area() > rectangle.area()) {
            return 1;
        } else if (area() < rectangle.area()) {
            return -1;
        /*} else (area() == rectangle.area()) {
            return 0;
        }*/
        }
        return 0;
    }
}
