package com.arrays_demo;

public class RotateArray {

	public static void main(String[] args) {
		
		int []nums= {1,2,3,4,5};
		int k=3;
		
		int count=0;
		int i=0;
		int val=nums[0];
		int rep=0;
		while(count<nums.length) {
			
			int pos=(i+k)%(nums.length);
			int temp=nums[pos];
			nums[pos]=val;
			i=pos;
			
			if(pos==rep) {
				rep=(i+1)%(nums.length);
				val=nums[rep];
				i=rep;
				count=count+1;
				continue;
			}
			val=temp;
			count++;
		}
		System.out.println(i);
		for(int e:nums)
			System.out.print(e);
	}
}
