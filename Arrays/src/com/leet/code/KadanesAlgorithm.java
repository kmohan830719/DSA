package com.leet.code;

public class KadanesAlgorithm {

	public static int maxSumSubArray(int arr[]) {
		int maxSum=Integer.MIN_VALUE;
		int currentSum=0;
		
		for(int i=0;i<arr.length;i++) {
			currentSum+=arr[i];
			
			if(currentSum<0)
				currentSum=0;
			else if(currentSum>maxSum)
				maxSum=currentSum;
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,-2,3,-4};
		int max=maxSumSubArray(arr);
		System.out.println(max);
	}
}
