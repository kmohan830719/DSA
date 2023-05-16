package com.geeks;

public class ReverseArray {
	
	//using for loop
//	public static int[] reverse(int nums[]) {
//		int j=nums.length-1;
//		for(int i=0;i<(nums.length)/2;i++) {
//			int temp=nums[i];
//			nums[i]=nums[j];
//			nums[j]=temp;
//			j--;
//		}
//		return nums;
//	}
	
	//using while loop
	public static int[] reverse(int nums[]){
		int l=0;
		int h=nums.length-1;
		while(l<h) {
			int temp=nums[l];
			nums[l]=nums[h];
			nums[h]=temp;
			
			l++;
			h--;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,8};
		int nums[]=reverse(arr);
		for(int e:nums)
			System.out.print(e+" ");
	}

}
