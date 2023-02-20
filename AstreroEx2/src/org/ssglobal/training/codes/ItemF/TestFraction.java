package org.ssglobal.training.codes.ItemF;

public class TestFraction {
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		f1.numerator = 3;
		f1.denominator = 4;
		Fraction f2 = new Fraction();
		f2.numerator = 2;
		f2.denominator = 5;
		
		f1.printRational();
		f2.multiply(f1).printRational();
		f2.add(f1).printRational();
		System.out.println(f2.greaterEqual(f1));
	}
}
