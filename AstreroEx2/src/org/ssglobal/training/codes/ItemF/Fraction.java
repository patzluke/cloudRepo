package org.ssglobal.training.codes.ItemF;

public class Fraction {
	public int numerator;
	public int denominator;

	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public void printRational() {
		System.out.println(getNumerator() + "/" + getDenominator());
	}
	
	public Fraction add(Fraction summand) {
		//get the new denominator that will be used to get the lcd
		int newDenominator = this.denominator * summand.denominator;
		//get the new lcd of the first fraction and multiply to numerator
		int firstDividend = (newDenominator / this.denominator) * this.numerator;
		//get the new lcd of the second (summand) fraction and multiply to numerator
		int secondDividend = (newDenominator / summand.getDenominator()) 
								 * summand.getNumerator();
		
		int newNumerator = firstDividend + secondDividend;
		Fraction newFraction = new Fraction();
		newFraction.numerator = newNumerator;
		newFraction.denominator = newDenominator;
	    return newFraction;
	}
	
	public Fraction multiply(Fraction factor) {
		int newDividend = this.numerator * factor.numerator;
		int newDivisor = this.denominator * factor.denominator;
		
		Fraction newFraction = new Fraction();
		newFraction.numerator = newDividend;
		newFraction.denominator = newDivisor;
		return newFraction;
	}
	
	public boolean greaterEqual(Fraction comp) {
		float firstFraction = (float) this.numerator / this.denominator; 
		float secondFraction = (float) comp.getNumerator() / comp.getDenominator(); 
		return (firstFraction >= secondFraction) ? true : false;
	}
}
