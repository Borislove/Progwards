package ru.progwards.t13.i_13;

/*Определены классы



	class Figure {

	}

	class Square extends Figure {
		private double side;
		public Square(double side) {
			this.side = side;
		}
		public double getSide() {
			return side;
		}
	}

	class Round extends Figure {
		private double diameter;
		public Round(double diameter) {
			this.diameter = diameter;
		}
		public double getDiameter() {
			return diameter;
		}
	}

Напишите метод с сигнатурой String figDetect(Figure fig), который
 - для квадрата возвращает "Сторона квадрата "+.side
- для круга возвращает "Диаметр круга "+.diameter
- для всех остальных классов "Неизвестная фигура"*/


public class Figure {
}

class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}

class Round extends Figure {
    private double diameter;

    public Round(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public static String figDetect(Figure fig) {

        if (fig instanceof Square) {
            return "Сторона квадрата " + ((Square) fig).getSide();
        } else if (fig instanceof Round) {
            return "Диаметр круга " + ((Round) fig).getDiameter();
        } else {
            return "Неизвестная фигура";
        }
    }
}


