package ru.progwards.t11.t11_1;

//Создание своего класса исключения
public class WrongFileName extends RuntimeException {  //static???
    public String fileName = "";

    public WrongFileName(String fileName) {
        super("Неправильное имя файла");
        this.fileName = fileName;
    }

    @Override
    public String getMessage() {
        return
                super.getMessage() +
                        fileName == null ? "" : " \"" + fileName + "\"";
    }
}
