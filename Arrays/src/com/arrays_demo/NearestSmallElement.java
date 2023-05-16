package com.arrays_demo;

public class NearestSmallElement {

	public static String nearSmallestElement(int []arr) {
		
		int n=arr.length;
		String str="";
		int arr1[]=new int[n];
		if(arr[0]<arr[1])
			arr1[0]=-1;
		else
			arr1[0]=arr[1];
		
		if(arr[n-1]>arr[n-2])
			arr1[n-1]=arr[n-2];
		else
			arr1[n-1]=-1;
		
		for(int j=1;j<n-1;j++) {
			if(arr[j]>arr[j-1] || arr[j]>arr[j+1]) {
				if(arr[j-1]<arr[j+1])
					arr1[j]=arr[j-1];
				else
					arr1[j]=arr[j+1];
			}else
				arr1[j]=-1;
		}
		for(int e:arr1)
			str=str+e+" ";
		return str;
		
	}
	public static void main(String[] args) {
		
		int []arr= {2,3,1,4,5,1};
		System.out.println(nearSmallestElement(arr));
	}
}
