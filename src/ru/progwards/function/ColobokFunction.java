package ru.progwards.function;

//Функция заменяет повторяющийся код
public class ColobokFunction {
    public static void helloAndBye(String name){
        System.out.print("Здравствуй, ");
        System.out.print(name);
        System.out.println("!");
        System.out.println("-Здравствуй, колобок!");

        System.out.print("-До свидания, ");
        System.out.print(name);
        System.out.println("!");
        System.out.println("-До свидания, колобок!");
    }

    public static void main(String[] args) {
        System.out.println("Идёт колобок. Навстречу - 3 богатыря");

        helloAndBye("Илья Муромец");
        helloAndBye("Добрыня Никитич");
        helloAndBye("Алёша Попович");
        helloAndBye("Patrick");


        System.out.println("Идёт колобок дальше.");
        System.out.println("А навстречу ему Али-баба и сорок разбойников...");
        System.out.println("-Здравствуй, Али - баба!");
        System.out.println("-Иди лесом, колобок. Мы торопимся.");

    }
}
