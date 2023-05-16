package com.leet.code;

import java.util.Arrays;

public class SeiveOfEratosthenes {

	public static boolean[] countPrimes(int n) {
        boolean []prime=new boolean[n+1];
        //int primeCount=0;
        Arrays.fill(prime, true);
        if(n==0){
        prime[0]=false;
        }else{
        prime[0]=false;
        prime[1]=false;
        }

        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                prime[j]=false;
            }
        }
//        for(boolean e:prime){
//            if(e==true)
//            primeCount++;
//        }

        return prime;
    }
	
	public static void main(String[] args) {
		int n=10;
		boolean[] prime=SeiveOfEratosthenes.countPrimes(n);
		for(int i=0;i<n;i++){
           System.out.println(i+": "+prime[i]);
        }
	}
}
