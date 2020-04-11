package ru.progwards.t10.t10_1;

public class FewExceptionsInOne {
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



