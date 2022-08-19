package com.revature.lights;

public class WalkAxis {
	
	/* MY LOGIC 
	 * consider that the input of N = 4, giving us a (4,0) on the graph
	 * to turn off the lights in the suggested (most-right to most-left) order we would have the given pattern
	 * 0, 4, 0, 3, 1, 2
	 * the distances between each are as follows:
	 * |0-4| = 4
	 * |4-0| = 4
	 * |0-3| = 3
	 * |3-1| = 2
	 * |1-2| = 1
	 * Thus the total distance traveled is 14
	 * where 14 = 4 + 4 + 3 + 2 + 1,
	 * which can also be written as:
	 * sum = 1 + 2 + 3 + N + N
	 * 
	 * Similarly, if we had the input N = 6, the suggested order would yield the following pattern
	 * 0, 6, 0, 5, 1, 4, 2, 3
	 * and the distances between each (respective of their position in the above pattern) would be
	 * 6, 6, 5, 4, 3, 2, 1
	 * 
	 * Therefore, we can calculate the distance for any input N as
	 * 1 + 2 + . . . + N + N
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		walkOnTheAxis(123);
	}
	
	//method created from MY LOGIC listed above
	public static void walkOnTheAxis(int N) {
		int sum = 0;
		// for loop where i = 1, 2, ...., N
		for (int i = 1; i <=N; i++) {
			//each of the n values are added together
			sum = sum + i; 
		}
		//I added N here to cover the distance traveled between (0,0) and (N,0)
		int totalDistance = N + sum;
		System.out.println(totalDistance);
	}
}
