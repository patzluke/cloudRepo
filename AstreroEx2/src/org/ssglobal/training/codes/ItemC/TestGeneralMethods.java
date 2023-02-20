package org.ssglobal.training.codes.ItemC;

public class TestGeneralMethods {
	public static void main(String[] args) {
		GeneralMethods generalMethods = new GeneralMethods();
		
		generalMethods.powersOfTwo();
		generalMethods.alarm(1);
		System.out.println(generalMethods.sum100());
		System.out.println(generalMethods.sumRange(1, 100));
		System.out.println(generalMethods.maxOfTwo(30, 20));
		System.out.println(generalMethods.maxOfTwo(20, 30));
		System.out.println(generalMethods.larger(30, 20));
		System.out.println(generalMethods.evenlyDivisible(10, 10));
		System.out.println(generalMethods.evenlyDivisible(10, 20));
	}
}
