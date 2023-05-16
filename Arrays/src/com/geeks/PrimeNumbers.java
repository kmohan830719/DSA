package com.geeks;

public class PrimeNumbers {
   
	//first n prime numbers
	public static int[] primeNumber(int n) {
	    int[] primes = new int[n];
        primes[0] = 2;
        int count = 1;
        for (int num = 3; count < n; num++) {
            boolean isPrime = true;
            for (int i = 0; i < count; i++) {
                if (num % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[count] = num;
                count++;
            }
        }
 
       return primes;
	}
	
	public static void main(String[] args) {
		int arr[]=primeNumber(5);
		for(int e:arr)
			System.out.println(e);
	}
}
