package com.leet.code;

import java.util.HashSet;

public class ContainsDuplicateOrNot {
	
	//using broot force
//	public static boolean duplicate(int []nums) {
//		
//		for(int i=0;i<nums.length-1;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				if(nums[i]==nums[j])
//					return true;
//			}
//		}
//		
//		return false;
//	}
	
	//using array sort
//	public static boolean duplicate(int [] nums) {
//		Arrays.sort(nums);
//		for(int i=0;i<nums.length-1;i++) {
//			if(nums[i]==nums[i+1])
//				return true;
//		}
//		
//		return false;
//	}
	
	//using set
	public static boolean duplicate(int []arr) {
		HashSet<Integer> set=new HashSet<>();
		for(int e:arr) {
			if(set.contains(e))
				return true;
			set.add(e);
		}
		
		return false;
	}

	//main method
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		boolean check=duplicate(arr);
		System.out.println(check);
	}
}
