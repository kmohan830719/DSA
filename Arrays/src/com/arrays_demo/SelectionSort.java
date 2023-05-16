package com.arrays_demo;

public class SelectionSort {

	
	public static void main(String[] args) {
		
		int []arr= {1,4,3,5,7,3,8};
		
		for(int i=0;i<arr.length-1;i++) {
			
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j])
					smallest=j;
			}
			int temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
		}
		
		for(int e:arr)
		System.out.print(e);
	}
}
