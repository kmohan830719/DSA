//Input: num = [1,2,0,0], k = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234

package com.leet.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AddToArrayForm2 {
	
	//broot force
	public static List<Integer> addToArray(int nums[],int k){
		ArrayList<Integer> list=new ArrayList<>();
		int number=0;
		for(int i=0;i<nums.length;i++) {
			number=(number*10)+nums[i];
		}
		int sum=number+k;
	    while(sum>0) {
	    	int remainder=sum%10;
	    	list.add(remainder);
	    	sum=sum/10;
	    }
		
	    Collections.reverse(list);
		return list;
	}
	
//	public static List<Integer> addToArray(int num[], int k){
//		  ArrayList<Integer> s=new ArrayList<>();
//
//          int i=num.length-1;
//         
//          while(i>=0||k>0)
//              {
//              if(i>=0)
//              k=num[i]+k;
//              
//              s.add(k%10);
//              k=k/10;
//              i--;
//              
//              }
//              
//          Collections.reverse(s);
//    	  return s;
//	}
//	
	
      public static void main(String[] args) {
    	 int arr[]= {9,9,9,9};
    	 List<Integer> list=addToArray(arr,10);
    	 for(Integer e:list)
    		 System.out.print(e+" ");
    	
	}
}
