package ru.progwards.t8.t8_2.figure;

public class ConstructorTest {
    public static void main(String[] args) {
        class Parent {
            Parent() {
                System.out.println("Вызван конструктор Parent");
            }
        }
        class Child extends Parent {
            Child() {
                System.out.println("Вызван конструктор Child");
            }
        }
        new Child();
    }
}
