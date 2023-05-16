/*
 * Write a program to get 5 marks and sort in descending order
 */

//declaring the package
package com.arrays_demo;

//importing the package
import java.util.Scanner;

//declaring the class
public class Question1 {
    //main method
	public static void main(String[] args) {
		
		//creating the object of scanner class
		Scanner sc =new Scanner(System.in);
		
		//an array to store 5 marks
		int arr[]= new int[5];
		
		//taking the 5 marks from user
		System.out.println("Enter the 5 marks");
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();
		
		//logic to short array in descending order
		 for(int i=0;i<5;i++) {
   		  for(int j=4;j>0;j--) {
   			  if(arr[j]>arr[j-1]) {
   			  //swap
   			  int temp=arr[j];
   			  arr[j]=arr[j-1];
   	          arr[j-1]=temp;
   	          
   			  }
   		  }
   	  }
   	  
   	  //printing the shorted array
	 System.out.println("The array in descending order is: ");
   	  for(int i=0;i<=arr.length-1;i++) {
   		  System.out.print(arr[i]+",");
   	  }
		
		//closing the scanner
		sc.close();
	}
	//end of main method
}
//end of the class