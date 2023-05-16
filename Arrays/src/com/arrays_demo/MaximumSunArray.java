package com.arrays_demo;

public class MaximumSunArray {

	
	public static void main(String[] args) {
		
		int arr[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4 };
				
		int max=Integer.MIN_VALUE;
		
		for (int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
					if(sum>max) {
						max=sum;
					}
				}
			}
		}
		System.out.println(max);
	}
}
