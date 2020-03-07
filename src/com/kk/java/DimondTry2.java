/*
r  	c
    12345
r1	**A**
r2	*B*B*
r3	C***C
r4	*B*B*
r5	**A**
		  A
		B   B
       C     C
        B   B
          A

*/
package com.kk.java;

import java.util.ArrayList;

public class DimondTry2 {

	public static void main(String[] args) {
		String input = "ABC";		
		int numOfRowsPaint = 2*input.length()-1;
		System.out.println("row to paint="+numOfRowsPaint);
		String defaultStrRow = "";
		for (int i = 0; i < numOfRowsPaint; i++) {
			defaultStrRow += "*";
		}
		System.out.println("defaultStrRow="+defaultStrRow);
		
		for (int n = 0; n < numOfRowsPaint; n++) {
			String rowN = getStringForRowN(n, numOfRowsPaint, defaultStrRow);
		}
	
		ArrayList<String> defaultStrRowList = new ArrayList<String>();
		
		for (int i = 0; i < numOfRowsPaint; i++) {
			//defaultStrRowList.addAll(defaultStrRow);
		}
	}

	private static String getStringForRowN(int i, int numOfRowsPaint, String defaultStrRow) {
		int half = (numOfRowsPaint-1)/2;

		defaultStrRow.indexOf(half);
		replaceNthCharWithInput(i, numOfRowsPaint, defaultStrRow, half);
		return defaultStrRow;
	}

	private static void replaceNthCharWithInput(int n, int fixedWidth, String defaultStrRow, int half) {
		System.out.println("Row i="+n+"\t");
		if(fixedWidth % 2 == 0){
			//even

		} else {
			String prefix = defaultStrRow.substring(0,half-1);
			String suffix = defaultStrRow.substring(half+1,fixedWidth-1);
			System.out.println("prefix suffux"+prefix+"x"+suffix);
		}


	}
}
