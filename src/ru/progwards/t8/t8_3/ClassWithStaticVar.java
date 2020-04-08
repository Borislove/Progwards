package ru.progwards.t8.t8_3;

public class ClassWithStaticVar {

    static String staticString;

    public static void main(String[] args) {

        ClassWithStaticVar a = new ClassWithStaticVar();
        a.staticString =
                "Переменная я статическая, и хранюсь в одном месте, фактически.";
        System.out.println(a.staticString);

        ClassWithStaticVar b = new ClassWithStaticVar();
        b.staticString =
                "В одном месте? Что ж - доверяем, но, для верности, проверяем.";
        System.out.println(a.staticString);
    }
}
