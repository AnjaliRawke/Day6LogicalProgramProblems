package com.bridgelabz;

import java.util.Scanner;

public class SqrtNewtonMethod {
	public static void main(String[] args) {
		double c;// = Double.parseDouble(args[0]);
		Scanner Input=new Scanner(System.in);
		System.out.println("enter c: ");
		c = Input.nextInt();
		double epsilon = 1e-15;
		double t = c;

		// repeat until desired accuracy reached
		while (Math.abs(t - c/t) > epsilon*t) {
			t = (c/t + t) / 2.0;
		}
		// print out the estimate of the square root of c
		System.out.println(t);
	}
}
