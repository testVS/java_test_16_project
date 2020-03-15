package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello(" MOON15");

		Square s = new Square(4);
		System.out.println("Square area is: " + s.area());

		Rectangle r = new Rectangle(11,7.1);
		System.out.println("Rectangle area is: " + r.area());
 }
	public static void hello(String somebody) {
		System.out.println("Hello" + somebody + " !") ;
	}



}