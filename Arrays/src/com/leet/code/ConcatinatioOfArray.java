//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//- ans = [1,2,1,1,2,1]

package com.leet.code;

public class ConcatinatioOfArray {

	public static int[] concatinate(int []nums) {
		int arr[]=new int[2*nums.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=nums[j];
			j++;
			
			if(i==nums.length-1)
			j=0;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int nums[]=concatinate(arr);
		for(int e:nums)
			System.out.print(e+" ");
	}
}
