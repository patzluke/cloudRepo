package org.ssglobal.training.codes.ItemC;

public class GeneralMethods {
	public void powersOfTwo() {
		int twoRaiseToTen = 2;
		
		for (int i = 2; i <= 10; i++) {
			twoRaiseToTen *= 2;
		}
		System.out.println(twoRaiseToTen);
	}
	
	public void alarm(int numOfTimes) {
		for (int i = 0; i < numOfTimes; i++) {
			System.out.println("Alarm!");
		}
	}
	
	public int sum100() {
		int sumOfOneToOneHundred = 0;
		for (int i = 1; i <= 100; i++) {
			sumOfOneToOneHundred += i;
		}
		return sumOfOneToOneHundred;
	}
	
	public int sumRange(int firstRange, int secondRange) {
		int sumOfSpecifiedNum = 0;
		
		for (int i = firstRange; i <= secondRange; i++) {
			sumOfSpecifiedNum += i;
		}
		return sumOfSpecifiedNum;
	}
	
	public int maxOfTwo(int firstNum, int secondNum) {
		return (firstNum > secondNum) ? firstNum : secondNum;
	}
	
	public boolean larger(double firstNum, double secondNum) {
		return (firstNum > secondNum) ? true : false;
	}
	
	public boolean evenlyDivisible(int firstNum, int secondNum) {
		return (firstNum % secondNum == 0 && secondNum % firstNum == 0) ? true : false;
	}
}
