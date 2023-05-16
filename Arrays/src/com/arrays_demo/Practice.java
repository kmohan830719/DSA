package com.arrays_demo;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum=0 ;
		int max=0;
		int num,count=0,size1=0,size2=0;
		boolean present=false;
		int index=-0;
		
		int [] arr=new int[5];
	
		
		System.out.println("Enter the number");
		//for loop to calculate sum and find the greatest number
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			if(arr[i]>max) {
				max=arr[i];
			}
			
			}
		
		System.out.println("The sum is : "+sum);
		System.out.println("The highest number is: "+max);
		
		System.out.println("Enter the num you want to check");
		num=sc.nextInt();
		//lopp to find if a num is present and its index
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				present=true;
				index=i;
				count++;
			}
		}
		if(present) {
			System.out.println("The number "+num+" is present "+count+" times at index "+index);
			
		}else {
			System.out.println("The number is not present");
		}
		
		
		//counting the size for array to store even and odd numbers
				for(int i=0;i<arr.length;i++) {
					if(arr[i]%2==0)
						size1++;
					else 
						size2++;
				}
				
				int [] even=new int[size1];
				int [] odd=new int[size2];
				
		int j=0,k=0;
		//to separate even and odd numbers and add them into new array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) { 
				even[j++]=arr[i];
			}
			else {
				odd[k++]=arr[i];
			}
		}
		
		
		//printing the odd and even values
		System.out.println("The odd numbers are");
		for(int e:odd) {
			System.out.println(e);
		}
		System.out.println("The Even numbers are");
		for(int e:even) {
			System.out.println(e);
		}
		
		
		sc.close();
	}
}
