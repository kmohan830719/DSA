package com.arrays_demo;

public class Reverse {

	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,5,6,7};
		
		int remain=array.length/2;
		int temp;
		
		for (int i=0;i<=remain;i++) {
			temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		
		for (int e:array) {
			System.out.println(e);
		}
	}
}
