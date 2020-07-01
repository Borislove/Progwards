package ru.progwards.t11.t11_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFWithCities extends RandomAccessFile {

    //Вложенный класс
    public static class CityGeoLocation {
        public String city;
        public double lat;
        public double lon;

        public CityGeoLocation() {
            city = "";
        }

        //формируем значение по строке
        public CityGeoLocation(String cityStr) {
            if (cityStr == null)
                return;

            String[] cityArr = cityStr.split(",");

            city = cityArr[0].trim().toUpperCase();
            if (cityArr.length > 1)
                lat = Double.parseDouble(cityArr[1]);
            if (cityArr.length > 2)
                lon = Double.parseDouble(cityArr[2]);
        }

        @Override
        public String toString() {
            return city + " (" + lat + ", " + lon + ')';
        }
    }

    //свойства
    private long start = 0;
    private long end;

    public CityGeoLocation cityGeoLocation = new CityGeoLocation(); //выбранный город

    //методы
    public RAFWithCities(String pathName) throws FileNotFoundException {
        super(pathName, "r"); //открываем в режиме чтения
    }

    public boolean findCity(String city) throws IOException {
        city = city.trim().toUpperCase();

        start = 0;
        end = length();

        while (start != end) {
            //ищем середину и движемся к началу строки
            long current = startStringPosition(end + start) / 2;
            seek(current);
            String currentLine = readLine();
            if (currentLine == null)
                return false;
            currentLine = new String(currentLine.getBytes("ISO-8859-1"), "UTF-8");

            //сравниваем заданный город и найденный в файле
            cityGeoLocation = new CityGeoLocation(currentLine);
            int compareResult = city.compareTo(cityGeoLocation.city);
            if (compareResult == 0)
                return true;
            else if (compareResult > 0) {
                start = this.getFilePointer();
            } else {
                end = current;
            }
        }
        return false;
    }


    private long startStringPosition(long pos) throws IOException {
        //ищем символ конца строки 0x0d (\r) или 0x0A (\n)
        for (long i = pos; i >= 0; i--) {
            seek(i);
            int byteChar = read();
            if (byteChar == 0x0D || byteChar == 0x0A)
                return i + 1;
        }
        return 0;
    }

    //точка входа в программу
    public static void main(String[] args) {
        try (RAFWithCities rafcities = new RAFWithCities("e:/academy/misk/cities.csv")) {
            /*if (rafcities.findCity("Апатиты")) System.out.println(rafcities.cityGeoLocation);
            if (rafcities.findCity("ТомсК")) System.out.println(rafcities.cityGeoLocation);
            if (rafcities.findCity("ЯСНЫЙ")) System.out.println(rafcities.cityGeoLocation);
            if (rafcities.findCity("Владивосток")) System.out.println(rafcities.cityGeoLocation);
            if (rafcities.findCity("Яхрома")) System.out.println(rafcities.cityGeoLocation);*/

            if (rafcities.findCity("Москва")) System.out.println(rafcities.cityGeoLocation);
            if (rafcities.findCity("Абакан")) System.out.println(rafcities.cityGeoLocation);
            if (rafcities.findCity("Артём")) System.out.println(rafcities.cityGeoLocation);
            if (rafcities.findCity("Азов")) System.out.println(rafcities.cityGeoLocation);



        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


/*Москва,	55.75, 37.62
Абакан,	53.72, 91.43
Адлер,	43.43, 39.92
Азов,	47.11, 39.42
Александров,	56.4, 38.71
Алексин,	54.51, 37.07
Альметьевск,	54.9, 52.32
Анадырь,	64.73, 177.51
Анапа,	44.89, 37.32
Ангарск,	52.54, 103.89
Анжеро-Судженск,	56.08, 86.03
Апатиты,	67.56, 33.4
Арзамас,	55.39, 43.84
Армавир,	44.99, 41.12
Арсеньев,	44.15, 133.28
Артём,	43.36, 132.19
Архангельск,	64.54, 40.54

*/