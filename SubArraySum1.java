package com.revature.subarr;

public class SubArraySum1 {

	public static void main(String[] args) {
		int[] numbers = new int[] {1, 2, 0, 4};
		addSubPairs(numbers);
	}
	
	public static void addSubPairs(int[] arr) {
		int sum = 0;
		int sum2 = 0;
		int len = arr.length;
		
		for(int i = 0; i < len-1; i++) {
			sum = sum + arr[i];
		}
		
		for(int j=1; j < len; j++) {
			sum2 = sum2+arr[j];
		}
		
		if(sum > sum2) {
			int maxPair = sum;
			System.out.println("This is the maximum: " + maxPair);
		} else {
			System.out.println("This is the maximum: " + sum2);
		}
	}
}

