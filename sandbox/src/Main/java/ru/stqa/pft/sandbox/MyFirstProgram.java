package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("MOON15");

		Square s = new Square();
		s.l = 5.0;
		System.out.println("Square area is: " + area(s));

		Rectangle r = new Rectangle();
		r.a = 5.5;
		r.b = 4.5;
		System.out.println("Rectangle area is: " + area(r));

 }
	public static void hello(String somebody) {
		System.out.println("Hello" + somebody + " !") ;
	}

	public static double area (Square s){
		return s.l * s.l;
	}

	public static double area (Rectangle r){
		return r.a * r.b;
	}
}