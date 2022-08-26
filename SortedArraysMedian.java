package com.revature.median;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortedArraysMedian {

	public static void main(String[] args) {
		int [] nums1 = new int [] {1, 2, 3, 4};
		int [] nums2 = new int [] {2, 4, 6, 7, 8, 10, 12};
		findMedian(nums1, nums2);
		}  
	
	
	
	public static void findMedian(int[] nums1, int[] nums2) {
	
		int len1 = nums1.length;
		int len2 = nums2.length;
		int [] merged = new int[len1 + len2];
		
		//combines both int arrays into a single int array
		System.arraycopy(nums1, 0, merged, 0, len1);
		System.arraycopy(nums2, 0, merged, len1, len2);
		
		//sorts the combined array to ascending order
		for(int i = 0; i<merged.length-1; i++) {
			if (merged[i] > merged[i+1]) {
				int temp = merged[i];
				merged[i] = merged[i+1];
				merged[i+1] = temp;
				//reset loop
				i = -1;
			}
		}
		
		//checks the
		int remainder = merged.length % 2;
		
		//the array has an odd length, so the middle value is the median
		if (remainder == 1) {
			
			int median1 = merged.length/2;
			System.out.println(merged[median1]);
		
		//the array is an even length, so there are TWO numbers in the middle
		} else if (remainder == 0) {
			//gives the index of one number in the middle
			int midpair1 = merged.length/2;
			//gives index of other number in the middle
			int midpair2 = midpair1 - 1;
			double median = ((merged[midpair1] + merged[midpair2])/2 + 0.5);
			System.out.println(median);
	
			
		} else {
			
			System.out.println("Mathematical error");
		}
	}

}
