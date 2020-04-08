package ru.progwards.t5.n5_2.bot;

public class Table {
    Position position;
    double radius = 0.75; //в метрах

    //стулья
    Chair chair1;
    Chair chair2;
    Chair chair3;

    boolean inArea(Position otherPosition) {
        return position.inRadius(otherPosition, radius);
    }
}
