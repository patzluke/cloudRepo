package org.ssglobal.training.codes.ItemD;

public class Overflow {
	public static boolean sumOverflow(byte x, byte y) {
		return (x + y > 127 || x + y < -128) ? true : false;
	}
}
