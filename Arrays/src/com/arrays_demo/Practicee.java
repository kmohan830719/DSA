package com.arrays_demo;

import java.util.ArrayList;
import java.util.List;

public class Practicee {
 public static void main(String[] args) {
	 int nums[]={10, 19, 6, 3, 5};
	 List<Integer> list=new ArrayList<>();
	 for(int i=0;i<nums.length;i++){
         list.add(nums[i]);
     }
	 
	 int min=list.get(1);
	 //System.out.println(min);
	 int temp=list.get(0);
	 //System.out.println(temp);
	 int index=list.indexOf(min);
     list.set(0,min);
     System.out.println(list.get(0));
     
     System.out.println(index);
     list.set(index,temp);
	 
	 
	 for(Integer e:list) {
     	System.out.print(e+" ");
     }
     	
 }
}
