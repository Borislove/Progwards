package ru.progwards.t5.i5.point;

public class Point {

    class Point2D {
        int x;
        int y;

        Point2D(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x, y";
        }
    }
}
/*

class Point3D extends Point2D {
    private int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;

    }

    @Override
    String toString() {
        super.toString();
        return "x,y,z";
    }
}
}
*/
