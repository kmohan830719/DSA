//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7] 
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]

package com.leet.code;

public class SuffleTheArray {
	
	public static int[] suffle(int []nums) {
		int arr[]=new int [nums.length];
		
		int j=nums.length/2;
		int k=0;
		for(int i=0;i<nums.length;i++) {
			if(i%2==0) {
				arr[i]=nums[k];
				k++;
			}
			else {
				arr[i]=nums[j];
				j++;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int nums[]= {2,5,1,3,4,7};
		int arr[]=suffle(nums);
		for(int e:arr)
			System.out.print(e+" ");
	}

}
