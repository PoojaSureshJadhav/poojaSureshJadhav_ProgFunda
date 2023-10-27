package com.gradedproject.q2;

import java.util.Scanner;

public class XPowerN {
	
	static int getXPowerN(int x, int n) {
		if(n==0) {
			return 1;
		}
		return x*getXPowerN(x, n-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base number X: ");
		int x = scanner.nextInt();
		System.out.println("Enter the power N: ");
		int n = scanner.nextInt();

		System.out.println("X power N is: "+getXPowerN(x, n));
		scanner.close();
	}

}
