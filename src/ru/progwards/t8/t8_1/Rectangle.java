package ru.progwards.t8.t8_1;

import java.util.Objects;

public class Rectangle {

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    @Override
    public boolean equals(Object anObject) {
        //  if (this.area() == 0) return true;

        //if (area() != area()) return false;
        //if (area() == area()) return true;

        // if (new Rectangle(a, b) == null) return false;
        //  if (new Rectangle(a, b) != new Rectangle(a, b))  {return false;}
        //if (new Rectangle(a, b) == new Rectangle(a, b)) { return true;}
        //  if(area()==area()) return true;
        //   if (area() > 0) return true;
        // if (area() < 0) return false;

        //  if(area() == area()) return true;


        return true;
    }

    public static void main(String[] args) {

        System.out.println(new Rectangle(3, 3).equals(new Rectangle(2, 2)));
        System.out.println(new Rectangle(2, 3).equals(new Rectangle(5, 2))
        );
        System.out.println(new Rectangle(3, 4).equals(new Rectangle(6, 2))
        );
        System.out.println(new Rectangle(2, 2).equals(new Rectangle(2, 0)));
    }
}


/*. a.equals(null) всегда false
d. public boolean equals(Object o) обладает свойствами - транзитивность, рефлексивность и симметричность
e. Хеш-код предназначен для повышение быстродействия при поиске, добавлении и удалении элементов в коллекциях
*/