package ru.progwards.t9.t9_2;

//Объект как параметр
public class ObjectAsParam {
    static class Simple {
        int a = 0;
        boolean b = false;
        String msq = "Это класс Simple";

        @Override
        public String toString() {
            return "Simple{" +
                    "a=" + a +
                    ", b=" + b +
                    ", msq='" + msq + '\'' +
                    '}';
        }
    }

    static void objectAsParam(Simple simple) {
        simple.a = 5555;
        simple.b = true;
        simple.msq = "Сообщение изменено в objectAsParam";
    }

    public static void main(String[] args) {
        Simple simple = new Simple();
        System.out.println(simple);
        objectAsParam(simple);
        System.out.println(simple);
    }
}

