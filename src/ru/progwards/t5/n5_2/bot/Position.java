package ru.progwards.t5.n5_2.bot;

public class Position {
    double lat; //широта
    double lon; //долгота

    //попадание otherPosition в окружность с радиусом radius
    public boolean inRadius(Position otherPosition, double radius) {
        double latDiff = lat - otherPosition.lat;
        double lonDiff = lon - otherPosition.lon;
        return latDiff * latDiff + lonDiff * lonDiff <= radius;
    }
}
