package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello(" MOON15");

		Square s = new Square(5);
		System.out.println("Square area is: " + area(s));

		Rectangle r = new Rectangle(10,5.1);
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