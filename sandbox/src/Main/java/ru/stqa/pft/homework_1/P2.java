package ru.stqa.pft.homework_1;

public class P2 {
    public double y1;
    public double y2;

    public P2(double y1, double y2){
        this.y1 = y1;
        this.y2 = y2;
    }
    public double coord() {
        return Math.pow((this.y2 - this.y1), 2);
    }
}
