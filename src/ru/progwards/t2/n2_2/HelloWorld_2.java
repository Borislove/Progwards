package ru.progwards.t2.n2_2;

//Функция с параметрами и результатом, int
public class HelloWorld_2 {
    static void println(String str) {
        System.out.println(str);
    }

    //функция вернет значение в инт
    static int addition(int x, int y) {
        //int z = x + y; //складываем x+y   //переменная нужна если используется несколько раз
        //return z; //возвращаем результат

        return x+y;  //возвращаем результат
    }

    public static void main(String[] args) {
        println("Привет, мир!");
        println("Мир, ты слышишь меня?!");
        System.out.println("Я знаю, что 5 + 7 = ");


      //-------------------------------
      //  int z = addition(5, 7);
      //  System.out.println(z);
        //---------------сокращение-------------
        System.out.println(addition(5,7));
    }
}
