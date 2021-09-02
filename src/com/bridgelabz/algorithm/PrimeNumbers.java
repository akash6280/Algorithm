package com.bridgelabz.algorithm;

public class PrimeNumbers{   
	
	static void checkPrime(int number){  
		 
		if(number==0||number==1)
			return;
		
		for(int factor=2;factor<=number/2;factor++) {
			if(number%factor==0)
				return;
		}
		   System.out.println(number);
	}
		   
		   
 
		   
	public static void main(String args[]){   
			 
		for(int number=0;number<=1000;number++)
			checkPrime(number); 
		 }
}
