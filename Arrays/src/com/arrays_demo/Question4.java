/*
 * WAP to find out the largest element in the array
 */

package com.arrays_demo;

public class Question4 {
      //main method
	public static void main(String[] args) {
		
		int arr[]= {100,2,98,400,5,6,7,89,43};
		
		int temp=0;;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>=arr[j] && arr[i]>=temp) {
					temp=arr[i];
				}
			}
		}
		System.out.println("The largest number in the array is: "+temp);
	}
}
