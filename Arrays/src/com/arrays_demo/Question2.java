/*
 * Write a program to get 5 num in parameter as array and print maximum and minimum among all.
 */

//declaring the package
package com.arrays_demo;

//importing the package
import java.util.Scanner;

//declaring the class
public class Question2 {
    //main method
	public static void main(String[] args) {
		
		//creating the object of scanner class
		Scanner sc =new Scanner(System.in);
		
		//an array of size 5
		int arr[]= new int[5];
		
		//taking the 5 elements from user
		System.out.println("Enter the 5 elements");
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();
		
		int min=arr[0];
		int max=arr[0];
		
		//finding the minimum element in the array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		//finding the maximum element in the array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		//printing the minimum and maximum element
		System.out.println("The smallest element in the array is: "+min);
		System.out.println("The maximum element in the array is: "+max);
		
		//closing the scanner
		sc.close();
	}
	//end of main method
}
//end of the class
