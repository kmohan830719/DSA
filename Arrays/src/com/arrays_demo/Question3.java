/*
 * WAP to reverse the array using temporary variable
 */

package com.arrays_demo;

public class Question3 {
	//main method
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,6,7,7};
	    int remen=arr.length/2;
		int temp;
		for(int i=0;i<=remen;i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;	
		}
		for(int element:arr) {
			System.out.println(element);
		}
	}	
}
