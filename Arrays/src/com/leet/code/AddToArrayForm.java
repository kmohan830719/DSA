package com.leet.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

	public static void main(String[] args) {
		int num[]= {7};
		int k=993;
		int remainder=0;
		
		 List<Integer> list=new ArrayList<>();
	       
		 for(int i=num.length-1;i>=0;i--) {
			 int n=k%10; 
			 int sum=num[i]+n+remainder;
			 if(sum>9) {
				 list.add(sum%10);
				 remainder=sum/10;
			 }
			 else {
				 list.add(sum);
			     remainder=sum/10;
			 }
			 k=k/10;
			 
		 }
		 while(k>0 || remainder>0) {
			     int n=(k%10)+remainder;
			     if(n>9) {
			    	 list.add(n%10);
			    	 k/=10;
			    	 remainder=n/10;
			     }
			     else {
			    	 list.add(n);
			    	 k/=10;
			    	 remainder=n/10;
			     }	
		 }
		 
	       Collections.reverse(list);
	       System.out.println(list);
	}
}
