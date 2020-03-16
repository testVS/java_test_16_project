package ru.stqa.pft.homework_1;


public class Point {
    public static void main(String[] args) {

        //координаты первой точки
        P1 p1 = new P1(75,23);
        System.out.println("Координаты точки p1 = " + p1.coord());
        //координаты второй точки
        P2 p2 = new P2(27,35);
        System.out.println("Координаты точки p2 = " + p2.coord());

        System.out.println("Растояние между p1 и p2 = " + Math.sqrt(p1.coord() + p2.coord()) );
    }
}