package ru.progwards.t11.p11_4;

import ru.progwards.t6.t6_3.Array;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    public static String setStars(String filename) {

        StringBuilder str = new StringBuilder();

        try (RandomAccessFile file = new RandomAccessFile(filename, "r");
             RandomAccessFile fileChanged = new RandomAccessFile("src\\ru\\progwards\\t11\\p11_4\\output.txt", "rw")) {   // !!!!

            fileChanged.write(file.readLine().getBytes());

            //чтение файла
            FileReader reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String strFromFile = scanner.nextLine();
           //     System.out.println(strFromFile);
                char[] strToArray = strFromFile.toCharArray();

              //  System.out.println(Arrays.toString(strToArray));

                for (int i = 9; i < strToArray.length; i++) {
                    str.append(strToArray[i]);
                    i +=9;
                }

               /* for (Character c : strToArray) {
                    System.out.println(c);
                }*/
            }

            //System.out.println(Arrays.toString(strToArray));

            for (int i = 9; i < file.length(); ) {
                file.seek(i); //в позицию курсор оригинал
                //str.append(i); //добавили в билдер

                //  str.append(file.readChar());

                //str.append(file.readUTF());
                fileChanged.seek(i); //в позицию курсор копия
                fileChanged.write(42);   // * через хеш , перезапись на звездочку
                i += 10;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); //filename (Не удается найти указанный файл)  // e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }

      //  System.out.println(str.toString().toString().toString());
        System.out.println(str);
        return str.toString();
    }

    public static void main(String[] args) {
        Test test = new Test();

        setStars("src\\ru\\progwards\\t11\\p11_4\\input.txt");
    }
}

