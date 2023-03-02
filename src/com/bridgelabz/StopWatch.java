package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		long start,end;
		double time;
		System.out.println("Type any character to start the stopwatch");
		char s=Input.next().charAt(0);
		start=System.currentTimeMillis();
		System.out.println("StopWatch Started");
		System.out.println("Type any character to stop the stopwatch");
		char m=Input.next().charAt(0);
		end=System.currentTimeMillis();
		System.out.println("StopWatch Ended");
		time=(end-start)/1000.0;
		System.out.println("elapsed time: "+time);
	}
}
