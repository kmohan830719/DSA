//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
		
package com.leet.code;

public class ProductOfArrayExceptSelf {
	
	//using broot force
//	 public static int[] productExceptSelf(int[] nums) {
//	        int n=nums.length;
//	        int arr[]=new int[n];
//	        
//	        for(int i=0;i<n;i++){
//	        	int product=1;
//	        	for(int j=0;j<n;j++){
//	        		if(i==j)
//	        			continue;
//	        		else
//	        			product*=nums[j];	
//	        	}
//	        	arr[i]=product;
//	        }
//	       
//	        return arr; 
//	    }
	
	 //using division operator
	 public static int[] productExceptSelf(int[] nums) {
	        int n=nums.length;
	        int arr[]=new int[n];
	        
	        boolean flag=false;
	        
	        int product=1;
	        for(int i=0;i<n;i++){
	        	if(nums[i]==0) {
	            flag=true;
	            continue;
	        	}
	        	else
	        	product*=nums[i];
	        }
	        
	        for(int i=0;i<n;i++){
	        	if(flag==true) {
	        		if(nums[i]==0){
		        		arr[i]=product;
		        	}else
		        	arr[i]=0;
	        	}else
	        		arr[i]=product/nums[i];
	        	
	        }
	        return arr; 
	    }
	 
	 //main method
	 public static void main(String[] args){
		
		 int arr[]= {0,0};
		int result[]= productExceptSelf(arr);
		for(int e:result) {
			System.out.print(e+" ");
		}
	}
}
