package com.arrays_demo;

import java.util.ArrayList;
import java.util.List;

public class SumOfOddLengthSubArray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				
				List<Integer> lis =new ArrayList<>();
				for(int k=i;k<=j;k++) {
					lis.add(arr[k]);
				}
				if(lis.size()%2!=0) {
					for(Integer e:lis) {
						sum+=e;
					}
				}
					
			}
		}
		System.out.println(sum);
	}

}
