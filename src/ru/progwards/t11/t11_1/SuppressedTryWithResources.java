package ru.progwards.t11.t11_1;

//Решение с try-with-resources
public class SuppressedTryWithResources {

    public static void doAlwaysExceptions() throws Exception {
        try (AlwaysExceptions ae = new AlwaysExceptions(1)) {
            ae.method();
        }
    }

    public static void main(String[] args) {
        try {
            doAlwaysExceptions();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed())
                System.out.println(t.getMessage() + " (подавленное)");
        }
    }
}
