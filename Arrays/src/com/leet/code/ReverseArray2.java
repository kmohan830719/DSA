package com.leet.code;

public class ReverseArray2 {
     public static void main(String[] args) {
    	 int []s= {1,2,3,4,6};
    	 
    	 int left = 0;
         int right = s.length-1;
         while(left<right){
             int temp = s[left];
             s[left] = s[right];
             s[right] = temp;
             left++;
             right--;
         }
         
         for(int e:s)
        	 System.out.print(e);
	}
}
