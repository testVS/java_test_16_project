package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello(" World, this is my UPDATED homework #2 ");

		Square s = new Square(4);
		System.out.println("Square area is: " + s.area());

		Rectangle r = new Rectangle(11, 7.1);
		System.out.println("Rectangle area is: " + r.area());

		Point p1 = new Point(5,4);
		Point p2 = new Point(5,4);
		System.out.println("Растояние между p1 и p2 = " + distance(p1,p2) );
	}

	public static void hello(String somebody) {
		System.out.println("Hello " + somebody + " !");
	}

	public static double distance(Point p1, Point p2) {
		return Math.sqrt(p1.coord() + p2.coord());
	}
}