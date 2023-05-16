package com.arrays_demo;

import java.util.ArrayList;
import java.util.List;

public class OddLengthSubArray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		List<List<Integer>> list=new ArrayList<>();
	     
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) { 
				List<Integer> lis=new ArrayList<>();
				for(int k=i;k<=j;k++) {
				    lis.add(arr[k]);  
				}
				 
			    if(lis.size()%2!=0) {
			    	list.add(lis);
			    }
			}
		}
	
		for(List<Integer> e:list) {
			System.out.println(e);
		}
		
		
	}
}
