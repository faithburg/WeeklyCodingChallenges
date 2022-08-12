package com.revature.perfectnum;

import java.util.Scanner;

public class PerfectNumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number and find out if it's perfect");
		
		int number = scan.nextInt();
		checkPerfect(number);

		scan.close();
	}
	
	public static void checkPerfect (int x) {
		int sum = 0;
		
		//loops from 1 to given x - 1 (excludes x itself)
		for (int i = 1; i < x; i++)
			//checks to see that remainder is 0; thus i represents factors of x
			if(x%i == 0) {
				//adds the factors (i values) together
				sum = sum + i;
			}
		
		//checks if the sum produced by for loop equals the input x value
		if (sum == x) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
