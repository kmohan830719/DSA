/*
 * WAP to reverse an array
 */

//declaring the package
package com.arrays_demo;

//importing the package
import java.util.*;

//declaring the class
public class Question {
	//main method
	public static void main(String[] args) {
		
	    //creating the object of the scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking the array size from user
		System.out.println("Enter the length of the array");
		int size=sc.nextInt();
		
		//declaring an array
		int []arr=new int[size];
		
		//taking the array elements from the user
		System.out.println("Enter the array elemants");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		//logic to reverse the array
		System.out.println("The reversed array is:");
		for(int i=size-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
	}

}
