package ru.progwards.t11.p11_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*Реализовать метод с сигнатурой public String setStars(String filename)
который читает файл filename и меняет в нем каждый 10-йбайт на символ *,
 при этом конкатенируя оригинальный символ в строку ответа.
В случае ошибки выбросить исключение IOException со строкой сообщения:
равной имени класса оригинального сообщения


Например,при содержимом файла:

0123456789012345678A012345678B01

новое содержимое должно быть

012345678*012345678*012345678*01

и метод должен вернуть "9AB"*/

// TODO: 03.07.2020 разбить на массив, или каждые 10 вырезать и ставить звезду
public class Test {

    public String setStars(String filename) {

        //    RandomAccessFile fileChanged = new RandomAccessFile("src\\ru\\progwards\\t11\\p11_4\\output.txt","rw");  //изменённый

        try (RandomAccessFile file = new RandomAccessFile(filename, "r");
             RandomAccessFile fileChanged = new RandomAccessFile("src\\ru\\progwards\\t11\\p11_4\\output.txt", "rw")) {

            //  file.readLine();
            //  System.out.println(file.readLine());

           /* fileChanged.seek(10);
            fileChanged.write(42);
            */
            //   fileChanged.write(filename.getBytes());   //показал путь Оо

            //  fileChanged.writeChar(file.readLine().length());  //char

            fileChanged.write(file.readLine().getBytes());    //перезаписал

        /*    file.seek(9);
            fileChanged.seek(9);
            fileChanged.write(42);

            file.seek(19);
            fileChanged.seek(19);
            fileChanged.write(42);

            file.seek(29);
            fileChanged.seek(29);
            fileChanged.write(42);
*/

            String str = "";

            for (int i = 9; i < file.length(); ) {
                file.seek(i);
                fileChanged.seek(i);
                fileChanged.write(42);   // * через хеш
                i += 10;

            }

            /*file.seek(0);
            System.out.print("original: ");
            System.out.println(file.readLine());

            System.out.print("changed:  ");
            fileChanged.seek(0);
            System.out.println(fileChanged.readLine());

            System.out.print("need:     ");
            System.out.println("012345678*012345678*012345678*01");
            */

            file.seek(0);
            fileChanged.seek(0);
            String stringFile = file.readLine();
            String stringFileChanged = fileChanged.readLine();
            System.out.println(stringFile);
            System.out.println(stringFileChanged);

            Integer intFile = Integer.valueOf(stringFile.hashCode());
            Integer intFileChanged = Integer.valueOf(stringFileChanged.hashCode());

            //String test = String.valueOf(ending);


            //    fileChanged.write(file.readLine().getBytes());    //перезаписал
            //StringBuilder stringBuilder = new StringBuilder();


            //fileChanged.write(42);  //записано в конец

            //  file.seek(10);
            // file.write(1);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); //filename (Не удается найти указанный файл)
        } catch (IOException e) {
            e.getMessage();
        }
        return "";
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setStars("src\\ru\\progwards\\t11\\p11_4\\input.txt");
    }
}
