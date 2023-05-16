package com.arrays_demo;

public class InsertionSort {

	public static void main(String[] args) {
		int []arr= {1,3,9,5,6,7};
		
		  for (int i = 1; i < arr.length; i++) {
		        int temp = arr[i];
		        int j=i;
		        for (; j>0 && arr[j-1]>temp; j--) {
		            arr[j]=arr[j-1];
		        }
		        arr[j]=temp;
		    }
		  
		  for(int e:arr)
			  System.out.println(e);
	}
}
