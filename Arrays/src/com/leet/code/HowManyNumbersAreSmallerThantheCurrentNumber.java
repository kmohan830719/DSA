//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation: 
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1). 
//For nums[3]=2 there exist one smaller number than it (1). 
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

package com.leet.code;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
       
	public static int [] smallerNums(int []nums) {
		int []arr=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int count=0;
			int num=nums[i];
			for(int j=0;j<nums.length;j++) {
				if(i==j)
					continue;
				else if(nums[j]<num)
					count++;
			}
			arr[i]=count;
		}
		return arr;
	}
	
//	public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int [] freq = new int[101];
//        int n = nums.length;
//        for(int i = 0; i < n; i++){
//            freq[nums[i]]++;
//        }
//
//        int [] ans = new int [n];
//        for(int i = 0; i < n; i++){
//            int val = nums[i];
//            int count = 0;
//            for(int j = val - 1; j >= 0; j--){
//                count += freq[j];
//            }
//            ans[i] = count;
//        }
//
//        return ans;
//    }
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
	    int[] ans = new int[nums.length];
	    int[] count = new int[101]; 
	    for(int i=0;i<nums.length ;i++){
	        count[nums[i]]++;
	    }
	    for(int i=1;i<count.length;i++){
	        count[i] += count[i-1];
	    }
	    for(int i=0;i<nums.length ;i++){
	        if(nums[i] == 0){
	            ans[i] = 0;
	        }else{
	            ans[i] = count[nums[i]-1];
	        }
	    }
	    return ans;
	}
	
	public static void main(String[] args) {
		int arr[]= {8,1,2,2,3};
		int []result=smallerNumbersThanCurrent(arr);
		for(int e:result)
			System.out.print(e+" ");
	}
}
