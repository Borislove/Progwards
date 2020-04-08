package ru.progwards.t5.n5_2.bot;


//Стул
public class Chair {
    int id;
    Position position;
    double radius = 0.25; //радиус в метрах
    Person person; //человек
    Plate plate; //тарелка

    public Chair(int id) {
        this.id = id;
    }

    boolean inArea(Position otherPosition) {
        return position.inRadius(otherPosition, radius);
    }

    boolean isEmpty() { //возвращает истину если никто не сидит на стуле
        return Detector.chairIsEmpty(id);
    }

    void detectPerson() { //определить кто сидит по массе
        double personOnChairWeight = Detector.personOnChairWeight(id);
        if (personOnChairWeight < 30)
            //ребёнок
            person = new Person(PersonType.CHILD, personOnChairWeight);
        else if (personOnChairWeight > 50)
            //папа
            person = new Person(PersonType.FATHER, personOnChairWeight);
        else //в остальных случаях
            //мама
            person = new Person(PersonType.MOTHER, personOnChairWeight);
    }
}
