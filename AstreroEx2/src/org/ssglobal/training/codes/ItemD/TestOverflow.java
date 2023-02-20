package org.ssglobal.training.codes.ItemD;

public class TestOverflow {
	public static void main(String[] args) {
		byte firstNum = -127;
		byte secondNum = -1;
		
		System.out.println(Overflow.sumOverflow(firstNum, secondNum));
	}
}
