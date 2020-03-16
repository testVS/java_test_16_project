package ru.stqa.pft.homework_1;

public class P1 {
    public double x1;
    public double x2;

    public P1(double x1, double x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    public  double coord() {
        return Math.pow((this.x2 - this.x1), 2);
    }

}
