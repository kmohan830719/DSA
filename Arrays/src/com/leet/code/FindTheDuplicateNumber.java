//Input: nums = [1,3,4,2,2]
//Output: 2

package com.leet.code;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

//	public static int findDuplicate(int[] nums) {
//	      
//	      Set<Integer> set=new HashSet<>();
//	    
//	       for(int e:nums){
//	           if(set.contains(e))
//	            return e;
//	           set.add(e);
//	       }
//
//	        return -1;
//	    }
	
	//optimized code
//	public static int findDuplicate(int nums[]) {
//		boolean check[]=new boolean[nums.length+1];
//		for(int i=0;i<nums.length;i++) {
//			if(check[nums[i]])
//				return nums[i];
//			check[nums[i]]=true;
//		}
//		return -1;
//	}
	
	//using array
	public static int findDuplicate(int nums[]) {
		int check[]=new int[nums.length+1];
		for(int i=0;i<nums.length;i++) {
			if(check[nums[i]]!=0)
				return nums[i];
			check[nums[i]]++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,3,3,2,2};
		int duplicate=findDuplicate(arr);
		System.out.println(duplicate);
	}
}
