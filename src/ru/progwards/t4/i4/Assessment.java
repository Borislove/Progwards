package ru.progwards.t4.i4;

enum Kinds {   //виды оценок
    NOTRATED("не оценено"),      //0 - не оценено
    VERYBAD("очень плохо"),      //1..20 - очень плохо
    BAD("плохо"),          //21..40 - плохо
    SATISFACTORY("удовлетворительно"), //41..60 - удовлетворительно
    GOOD("хорошо"),         //61..80 - хорошо
    EXELLENT("отлично");      //81..100 - отлично

    private String stri;

    Kinds(String stri) {
        this.stri = stri;
    }

    public String getStri() {
        return stri;
    }
}

public class Assessment {

    static String textGrade(int grade) {
        String str = "";
        switch (grade) {
            case 1 - 20:
                System.out.println(Kinds.BAD.getStri());
                //  System.out.println(Kinds.values());
                //  System.out.println(Kinds.BAD.toString());
                //  System.out.println(Kinds.valueOf(Kinds.class, "не оценено"));
                break;
        }

        return str;
    }

    public static void main(String[] args) {
        textGrade(1);
    }
}







