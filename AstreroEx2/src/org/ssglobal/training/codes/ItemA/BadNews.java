package org.ssglobal.training.codes.ItemA;

public class BadNews {
	public static int maxOdd = 21;
	
	/*
	 print each odd number
	 */
	public static void writeOdds() {
		int count;
		
		for (count = 1; count <= maxOdd; count += 2) {
			System.out.print(count + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// write all odds up to 21
		writeOdds();
		
		// now, write all odds up to 11
		BadNews.maxOdd = 11;
		writeOdds();
	}
	/*
	 Errors
	 1st: Remove the final in variable MAX_ODD and make it camelCase
	 2nd: make count variable in writeOdds method available in all the scope of
	 	  the method, not just in for loop.
	 3rd: remove the minus 2 in max odd.
	 4th: change the count++ to count += 2 or just make the count = count + 2 to + 1
	 5th: remove the System.out.print(count + 2) since it wont be needed in the output
	 */
}
