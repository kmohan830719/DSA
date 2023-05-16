package com.leet.code;

public class RotateArray {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,6};
		int []arr1=new int[arr.length];
		
		int n=3;
		for(int i=0;i<arr.length;i++) {
			int l=(i+n)%arr.length;
			arr1[l]=arr[i];
		}
		for(int e:arr1)System.out.println(e);
	}
}
