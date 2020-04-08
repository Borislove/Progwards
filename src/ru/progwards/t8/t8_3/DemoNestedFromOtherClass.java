package ru.progwards.t8.t8_3;

import ru.progwards.t8.t8_3.figures.NestedFigures;

//import ru.progwards.t8.t8_3.figures.NestedFigures.* ; можно так где Segment segment = new Segment(9999999);
import java.util.Arrays;

//Создание вложенных классов извне
public class DemoNestedFromOtherClass {

    public static void main(String[] args) {
        NestedFigures.Segment segment = new NestedFigures.Segment(51);
        NestedFigures.Square square = new NestedFigures.Square(51);
        NestedFigures.Rectangle rectangle = new NestedFigures.Rectangle(51, 111);
        NestedFigures.Circle circle = new NestedFigures.Circle(51);
        NestedFigures.Triangle triangle = new NestedFigures.Triangle(31, 41, 51);

        NestedFigures.Figure[] figures = {segment, square, rectangle, circle, triangle};
        Arrays.sort(figures);
        for (NestedFigures.Figure value : figures) {  //var figure не работает
            NestedFigures.printInfo(value);
        }
    }
}
