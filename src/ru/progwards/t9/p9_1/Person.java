package ru.progwards.t9.p9_1;

/*Описан класс

	class Person {
		public String name;
		public Person(String name) {
			this.name = name;
		}
	}

И класс

	abstract class PersonCompare {
		public int compare(Person p1, Person p2) {
			return 0;
		}
	}
Напишите фрагмент кода, в котором создайте переменную класса PersonCompare personCompare
и проинициализируйте ее анонимным классом, который перекрывает метод compare реализуя его через p1.name.compareTo(p2.name)*/

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

abstract class PersonCompare {

    public int compare(Person p1, Person p2) {
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        PersonCompare personCompare = new PersonCompare() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        };
    }
}




