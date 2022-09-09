package com.revature.gap;

public class LargestGapArray {

	public static void findLargestGap(int[] A) {
		int length = A.length;
		
		//sorts array into ascending order
		for(int i = 0; i<length-1; i++) {
			if(A[i] > A[i+1]) {
				int temp = A[i];
				A[i] = A[i+1];
				A[i+1] = temp;
				i = -1;
			}
		}
		
		int firstIndex = A[0];
		int lastIndex = A[length-1];
		int maxGap = Math.abs((firstIndex - lastIndex));
		System.out.println(maxGap);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {11, 3, -2, 1, 6};
		findLargestGap(nums);
	}
}
