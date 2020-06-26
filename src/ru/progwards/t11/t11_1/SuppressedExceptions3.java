package ru.progwards.t11.t11_1;

import java.io.IOException;

//Сохраненине подавленных исключений
public class SuppressedExceptions3 {

    public static void doAlwaysExceptions() throws Exception {

        AlwaysExceptions ae = new AlwaysExceptions(1);
        Throwable suppressed = null;

        try {
            ae.method();
        } catch (Throwable t) {
            suppressed = t;
            throw t;
        } finally {
            try {
                ae.close();
            } catch (Throwable t) {
                if (suppressed != null)
                    t.addSuppressed(suppressed);
                throw t;
            }
        }
    }

    public static void main(String[] args) {
        try {
            doAlwaysExceptions();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed())
                System.out.println(t.getMessage() + "(подавленное)");
        }
    }
}
