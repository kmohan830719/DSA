package com.geeks;

import java.util.Arrays;

public class MinAndMaxInAnArray {
	
	//one approch
//	public static void minMax(int arr[]){
//		int min=Integer.MAX_VALUE;
//		int max=Integer.MIN_VALUE;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min)
//				min=arr[i];
//			if(arr[i]>max)
//				max=arr[i];
//		}
//		
//		System.out.println("Min value is: "+min+"\n"+"Max value is: "+max);
//	}
	
	//another approach
	public static void minMax(int nums[]) {
		
		Arrays.sort(nums);
		
		System.out.println("Min value is: "+nums[0]+"\n"+"Max value is: "+nums[nums.length-1]);
	}
    
	public static void main(String[] args) {
		int arr[]= {2,1,3,5,6,7};
		minMax(arr);
	}
}
