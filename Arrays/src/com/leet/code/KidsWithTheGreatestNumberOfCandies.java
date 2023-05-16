//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true] 
//Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

package com.leet.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    
	//broot force
//	public static boolean[] kidCandy(int candies[], int extra) {
//		boolean arr[]=new boolean[candies.length];
//		Arrays.fill(arr, true);
//		
//		for(int i=0;i<candies.length;i++) {
//			int sum=candies[i]+extra;
//			for(int j=0;j<candies.length;j++) {
//				if(i==j)
//					continue;
//				else if(candies[j]>sum)
//					arr[i]=false;
//		
//			}	
//		}
//		return arr;
//	}
	
	public static List<Boolean> kidCandy(int []candies, int extra){
		List<Boolean> list=new ArrayList<>();
		int max=Integer.MIN_VALUE;
		for(int e:candies) {
			if(e>max)
			max=e;
		}
		
		for(int i=0;i<candies.length;i++) {
			int sum=candies[i]+extra;
			if(sum>=max)
				list.add(true);
			else
				list.add(false);
		}
		
		return list;
	}
	
	
	public static void main(String[] args) {
		int nums[]= {2,3,5,1,3};
		int extra=3;
		List<Boolean> check=kidCandy(nums, extra);
		for(boolean e:check)
			System.out.print(e+" ");
	}
}
