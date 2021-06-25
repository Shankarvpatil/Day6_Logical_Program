package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class Fibbonacci_series {

	public static void main(String[] args, int num1) {
		Utility utility = new Utility();
		System.out.print("Enter the number How many number of series you want: ");
		int num1 = utility.getIntValue();
		Utility.fibonacci(num1);

	}

}
