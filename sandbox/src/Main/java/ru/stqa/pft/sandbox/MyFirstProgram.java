package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		double a = 5.5;
		double b = 6.5;
		hello("MOON15");
		System.out.println("Square are is: " + area(a));
		System.out.println("Rectangle are is: " + area(a,b));
 }
	public static void hello(String somebody) {
		System.out.println("Hello" + somebody + "!") ;
		;
	}

	public static double area (Double a){
		return a * a;
	}

	public static double area (Double a, Double b){
		return a * b;
	}
}