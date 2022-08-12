package com.revature.quad;

import java.util.Scanner;

public class QuadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = quadraticEquation(2, -7, 3);
		System.out.println(result);
	}
		
	public static double quadraticEquation (int a, int b, int c) {
		//the part of the equation under the radical -- added to add neatness to code
		double radical = Math.sqrt(b*b - (4*a*c));
		//the entire quadratic equation
		double x = (-b + radical)/(2*a);
		//rounding
		double answer = Math.round(x);
		return answer;
	}


}
