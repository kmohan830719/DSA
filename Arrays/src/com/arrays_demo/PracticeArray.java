package com.arrays_demo;

import java.util.ArrayList;
import java.util.List;

public class PracticeArray {
	  public static int total_swaps(int[] nums) {
	        
	        List<Integer> list=new ArrayList<>();
	        
	        for(int i=0;i<nums.length;i++){
	            list.add(nums[i]);
	        }
	        
	        int count=0;
	        
	        for(int i=0;i<list.size()-1;i++){
	            int min=Integer.MAX_VALUE;
	            
	            for(int j=i+1;j<list.size();j++){
	                if(list.get(i)>list.get(j)&& list.get(j)<min)
	                   min=list.get(j);
	                  }
	               
	             if(min<list.get(i)){
	              int temp=list.get(i);
	              int index=list.indexOf(min);
	              list.set(i,min);
	              list.set(index,temp);
	              count++;
	             }  
	        }
	        for(Integer e:list) {
	        	System.out.print(e+" ");
	        }
	        	
	        
	        return count;
	    }

	public static void main(String[] args) {
		
	int arr[]={1 ,4, 5, 3, 2};
	
	int count=PracticeArray.total_swaps(arr);
	System.out.println("\n"+count);
	}
}
