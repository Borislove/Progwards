package ru.progwards.t16.t16_1;

import java.util.Date;

public class Test {
    private Date date;

    public Test(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setZero() {
        date.setTime(0);
    }

    static void testdate1() {
        Date date = new Date();
        Test mc = new Test(date);
        System.out.println(mc.getDate());
        date.setTime(0);
        System.out.println(mc.getDate());
    }

    static void testdate2() {
        Date date = new Date();
        Test mc1 = new Test(date);

        System.out.println(mc1.getDate());
        Test mc2 = new Test(date);
        mc2.setZero();
        System.out.println(mc1.getDate());
    }

    public static void main(String[] args) {
        testdate1();
    }
}
