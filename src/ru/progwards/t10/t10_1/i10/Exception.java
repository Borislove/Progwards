package ru.progwards.t10.t10_1.i10;

/*Напишите функцию, со спецификацией public Integer sqr(Integer n)
 которая вычисляет квадрат переданного числа

Сделайте обработку NullPointerException,
и в этом случае функция должна вернуть -1*/
public class Exception extends Throwable {
    public Integer sqr(Integer n) {
        try {
            return n * n;
        } catch (
                ArithmeticException e) {
            return -1;
        } catch (NullPointerException e) {
            return -1;
        } catch (java.lang.Exception e) {
            return 0;
        }
    }
}
