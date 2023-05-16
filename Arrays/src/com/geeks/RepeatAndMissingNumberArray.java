package com.geeks;

public class RepeatAndMissingNumberArray {

	  public static int[] repeatedNumber(final int[] A) {
		  int arr[]=new int[2];
		  int check[]=new int[A.length+1];
		  check[0]=1;
		  for(int i=0;i<A.length;i++) {
			  if(check[A[i]]!=0)
				  arr[0]=A[i];
			  check[A[i]]++;
		  }
		
		  for(int i=0;i<check.length;i++) {
			  if(check[i]==0)
				  arr[1]=i;
		  }
		  
		  return arr;
				  
	    }
	  
	  public static void main(String[] args) {
		final int arr[]= {1,2,3,3,5};
		int result[]=repeatedNumber(arr);
		for(int e:result)
			System.out.print(e+" ");
	}
}
