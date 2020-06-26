package ru.progwards.t11.t11_1;

import java.io.IOException;

//Класс для исследования подавленных исключений
public class AlwaysExceptions implements AutoCloseable {
    int id = 0;

    public AlwaysExceptions(int id) throws IOException {
        this.id = id;
    }

    public void method() throws IOException {
        throw new IOException(this + ": исключение в method");
    }

    @Override
    public void close() throws Exception {
        throw new IOException(this + ": исключение в close");
    }

    @Override
    public String toString() {
        return "AlwaysExceptions{" +
                "id=" + id +
                '}';
    }
}
