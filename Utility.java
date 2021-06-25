package com.bridgelab.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	// get integer input
	public int getIntValue() {
		return scanner.nextInt();
	}
  //Fibonacci Series 
	public static void fibonacci(int num1) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int i = 1;
        while (i<=num1-2) {
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c + " ");
            i++;
        }
	}
}
//Perfect Number
private static int perfectNumber(int num) {
        int i = 1;
        int sum = 0;
        for (i=1; i<num/2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
