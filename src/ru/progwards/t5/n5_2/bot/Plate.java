package ru.progwards.t5.n5_2.bot;

//Тарелка
public class Plate {
    int id; //идентификатор
    Position position; //позиция
    double volume = 1000; //максимальный объем в мл

    public Plate(int id) {
        this.id = id;
    }

    boolean isEmpty() { //определяет если в тарелке что то или она пустая
        return Detector.plateIsEmpty(id);
    }
}
