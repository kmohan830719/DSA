//Given an Array (arr) of size n. It only contains elements from range [1,n].
//Return an Array of all integers in the range [1,n] that do not appear in the array.

//You Have to solve this question without using any extra array.
//Hint:- Try using the last approach of rotate arrays Question

//Example 1:
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//Explanation:- All elements are present from 1 to 8 except 5 and 6.

package com.geeks;

import java.util.ArrayList;
import java.util.List;

public class DisappearingElements {
	
	//using brute force
//	public static List<Integer> missingDigits(int arr[]){
//		List<Integer> list=new ArrayList<>();
//		for(int i=1;i<=arr.length;i++) {
//			boolean check=true;
//			for(int j=0;j<arr.length;j++) {
//				if(i==arr[j]) {
//				check=false;
//				break;
//				}
//			}
//			if(check)
//			list.add(i);
//		}
//		return list;
//	}
	
	//rotate array using extra array
//	public static List<Integer> missingDigits(int arr[]){
//		List<Integer> list=new ArrayList<>();
//		int nums[]=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			int position=(arr[i]-1)%arr.length;
//			nums[position]=arr[i];
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(nums[i]==0)
//				list.add(i+1);
//		}
//		return list;
//	}
	
	//using rotate array but without any extra space
	public static List<Integer> missingDigits(int arr[]){
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			
		}
		return list;
	}

	
	//main method
	public static void main(String[] args) {
		int nums[]= {4,3,2,7,8,2,3,1};
		System.out.println(missingDigits(nums));
	}
}
