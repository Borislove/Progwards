package ru.progwards.t6.i6.rectangle;

/*Описан класс

	class Rectangle {
		private double a;
		private double b;

		public Rectangle(double a, double b) {
		        this.a = a;
			this.b = b;
                 }

		public double area() {

			return a*b;
		}
}

реализуйте метод compareTo с сигнатурой
public int compareTo(Rectangle anRectangle) который должен сравнивать прямоугольники по величине их площади.
При сравнении a.compareTo(b) метод должен возвращать
a   > b : 1
a == b : 0
a   < b : -1

Например

прямоугольник 2x2  >  прямоугольника 1x1 - результат 1
прямоугольник 2x3 == прямоугольнику 3x2 - результат 0
прямоугольник 2x2  <  прямоугольника 3x3 - результат -1*/

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }

    public double area() {
        return a * b;
    }

    public int compareTo(Rectangle anRectangle) {
        //      new Rectangle(a, b);
//        new Rectangle(a, b);

        //Double a = this.a;
        // Double b = this.b;

        //a.compareTo(b);

        //Double ac = area();
        //Double ab = area();

/*
        Double test = this.area();
        Double test1 = this.area();
        return test.compareTo(test1);*/

        //  anRectangle = new Rectangle(a, b);

        //-------------------------------------
       /* Rectangle ab = new Rectangle(a,b);
        Rectangle ba = new Rectangle(a, b);
        return ab.compareTo(ba);*/
        //-------------------------------------

      /*  Rectangle ab = new Rectangle(a, b);
        ab.area();
        Double abc = ab.area();
        Rectangle ba = new Rectangle(a, b);
        ba.area();
        Double abcd = ba.area();

        return abc.compareTo(abcd);*/
        //-------------------------------------
        //return ac.compareTo(ab);

        //return a.compareTo(b);

        //return new Rectangle(a, b).compareTo(a, b);

        //-------------------------------------
        //  return new Rectangle(a,b).compareTo(new Rectangle(a,b));  //что не нравится ?

        //return (new Rectangle(a,b).area( ) ).compareTo ( (new Rectangle(a,b).area ( ) ) );

        // return (new Rectangle(a, b).area()).compareTo (new Rectangle(a,b).area());


        //-----------------------------------

     /*   Rectangle ab = new Rectangle(a, b);
        Double abc = ab.area();
        Rectangle ba = new Rectangle(a, b);
        Double abcd = ab.area();

        if (abc.compareTo(abcd) > 0) {
            return 1;
        }else
        if (abc.compareTo(abcd) < 0) {
            return -1;
        }
        if(abc.compareTo(abcd)==0) {
            return 0;
        }
        //else
        return 999;*/
        //-----------------------------------
        //*****развлекаюсь...
    /*    if (abc>abcd.compareTo(abc)) {
            return 1;
        }
        if(abc<abc.compareTo(abcd)) {
            return -1;
        }
        if (abc.compareTo(abcd)==0) {
            return 0;
        }
        return 0;*/




     /*   Double a = this.a;
        Double b = this.b;
        if(a.compareTo(b) > 0) {
            return 1;
        }
        if(a.compareTo(b) < 0) {
            return -1;
        }
        if(a.compareTo(b) == 0) {
            return 0;
        }
        return 777;*/


        // new Rectangle(a,b);
        //  new Rectangle(a,b);

      /*  if (new Rectangle(a, b).compareTo(new Rectangle(a, b)) > 0) {
            return 1;
        }

        if (new Rectangle(a, b).compareTo(new Rectangle(a, b)) < 0) {
            return -1;
        }

        return 0;
*/


     /* Rectangle ab = new Rectangle(a,b);

        System.out.println("ab "+ab.area());

        Rectangle ba = new Rectangle(a,b);

        System.out.println("ba "+ba.area());
*/

        /*if(new Rectangle(a,b).compareTo(new Rectangle(a,b)) ==0 ) {
            return 10;
        }*/

       /* Double abcd = Double.valueOf(area());
        Double abcdfadfa = Double.valueOf(new Rectangle(a, b).area());
        Double abcdfadfafadfs = Double.valueOf(new Rectangle(a, b).area());

        Double abcde = Double.valueOf(area());
*//*
 if(abcd.compareTo(abcde)>0) {
     return 1;
 }*//*

        if (abcdfadfa.compareTo(abcdfadfafadfs) > 0) {
            System.out.println("1");
            return 1;
        }

        if (abcdfadfa.compareTo(abcdfadfafadfs) < 0) {
            return -1;
        }
        return 9999;*/


//------------ответ где то тут...

 /*       if(a>b) {
            return 1;
        }
        if(a<b || b>a) {

            return 0;}

        return -1;

    }*/

    /*if(a<b || b>a) {

            return 0;}*/


        //-----------------------почти....

    /*    if (a > b && a > 0) {
            return -1;
        }

        if (a == b && a > 0 && b > 0) {
            return 1;   //тут меняешь на -1 и выходит другой результат
        }
        if (a < b) {
            return 0;
        } else
            return -1;
    }*/

 /*       Double ab = Double.valueOf(a);
        Double ba = Double.valueOf(b);

        if ((ab.compareTo(ba) > 0)) {
            System.out.println("1");
            return 1;

        }
        if ((ab.compareTo(ba) < 0)) {
            System.out.println("-1");
            return -1;
        }
        if ((ab.compareTo(ba)) == 0) {
            System.out.println("0");
            return 0;
        }
        return 0;
    }*/

/*
        Rectangle ab = new Rectangle(a, b);
        ab.area();
        Double abc = ab.area();
        Rectangle ba = new Rectangle(a, b);
        ba.area();
        Double abcd = ba.area();

        System.out.println(abc);
        System.out.println(abcd);
        */
        //    this.a = a;
        //   this.b = b;

        //  new Rectangle(a,b).compareTo(new Rectangle(a,b));
      /* if(new Rectangle(a,b).compareTo(new Rectangle(a,b)) == 0) {
           return 0;
       }*/
     /*   if(new Rectangle(a,b).compareTo(new Rectangle(a,b)) > 0) {  //куча экспепшинов
            return 1;
        }
        if(new Rectangle(a,b).compareTo(new Rectangle(a,b)) < 0) {
            return -1;
        }

        return 0;


    }*/
   /*     if(a>b) {
            return -1;
        }
        if(a<b) {

            return 0;}else



          //      new Rectangle(a,b);
        if( area()>area()) {
            return 1;
        }
        if(area()<area()){
            return -1;
        }


        return 0;*/


        // TODO: 11.02.2020 страдай!

        return 0;
    }
}


class Main {

    public static void main(String[] args) {
      /*  Rectangle ab = new Rectangle(15, 9);
        ab.compareTo(ab);
        System.out.println(ab);
        System.out.println(ab.compareTo(ab));*/


        //new Rectangle(2, 3).compareTo(new Rectangle(30, 20));
        new Rectangle(200, 3).compareTo(new Rectangle(20, 20));
        // System.out.println(new Rectangle(2, 3).compareTo(new Rectangle(3, 2)));
        // System.out.println(new Rectangle(3, 3).compareTo(new Rectangle(3, 3)));
        //System.out.println(new Rectangle(3, 3).compareTo(new Rectangle(3, 90)));


    }

}


//-------------------решение-----------------------------------
/*
 public int compareTo(Rectangle anRectangle) {
        if (area() > (anRectangle.a * anRectangle.b)) {
            return 1;
        } else if ((area()) == (anRectangle.a * anRectangle.b)) {
            return 0;
        } else {
            return -1;
        }
    }
 */