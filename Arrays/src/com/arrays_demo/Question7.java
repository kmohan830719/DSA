/*
 * WAP to find whether an array is shorted or not
 */

//declaring the package
package com.arrays_demo;

//declaring the class
public class Question7 {

	//main method
	public static void main(String[] args) {
		
		//an array
		int []arr= {1,3,5,6,3,45,77,4};
		
		
		boolean shorted=true;
		
		//condition to check whether a num is shorted or not
		for(int i=0;i<arr.length-1;i++) {
		   if(arr[i]>arr[i+1]) {
			   shorted=false;
		   }
		}
		//printing whether the numis shorted or not
		if(shorted) {
			System.out.println("The array is shorted");
		}else {
			System.out.println("The array is not shorted");
		}
	}	
}
