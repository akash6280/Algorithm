package com.bridgelabz.algorithm;

import java.util.Arrays;

public class PrimeNumbers{   
	
	static boolean checkPrime(int number){  
		 
		if(number==0||number==1)
			return false ;
		
		for(int factor=2;factor<=number/2;factor++) {
			if(number%factor==0)
				return false;
		}
		  return true;
	}
		   
	static boolean isAnagram(String string1, String string2) {  
	      

        if (string1.length() != string2.length()) {  
            return false;
        } 
        else {  
            char[] string1Array = string1.toCharArray();  
            char[] string2Array = string2.toCharArray();  
            
            Arrays.sort(string1Array);  
            Arrays.sort(string2Array);  
           
           if (Arrays.equals(string1Array,string2Array)) {  
            return true;  
           }
           else {  
            return false;
           }
        }
    }
	static boolean isPalindrome(int number1) {
		  int remainder,sum=0,reverseNumber=0;    
		  
		  reverseNumber=number1; 
		  
		  while(number1>0){    
		   remainder=number1%10;    
		   sum=(sum*10)+remainder;    
		   number1=number1/10;    
		  }   
		  
		  if(reverseNumber==sum)    
		   return true;
		  else
			return false;
					   
	}
 
		   
	public static void main(String args[]){   
			 
		for(int Number1=0;Number1<=1000;Number1++)
			for(int Number2=0;Number2<=1000;Number2++)
			if(checkPrime(Number1)&&checkPrime(Number2)) {
				
				if(isPalindrome(Number1)&& isPalindrome(Number2)&& isAnagram(Integer.toString(Number1),Integer.toString(Number2)))
					System.out.println(Number1+" "+Number2);
			}
		 }
}
