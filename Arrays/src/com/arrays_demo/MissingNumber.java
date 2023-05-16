package com.arrays_demo;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int arr[]= {3,4,2,5,6};
		
		int missing=0;
		
		for (int i=1;i<=arr.length+1;i++) {
			int m=0;
			int n=0;
			
			for(int j=0;j<arr.length;j++) {
				if(i!=arr[j])
					m=i;
				else 
					n=i;
			}
			if(m!=n) missing=m;
		}
		System.out.println(missing);
	}

}
