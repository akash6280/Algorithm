package com.bridgelabz.algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class AnagramWord {
	
	static Scanner scanner=new Scanner(System.in);
	
	    static void isAnagram(String string1, String string2) {  
	      
	        if (string1.length() != string2.length()) {  
	            System.out.println("Not anagram"); 
	        } 
	        else {  
	            char[] string1Array = string1.toCharArray();  
	            char[] string2Array = string2.toCharArray();  
	            
	            Arrays.sort(string1Array);  
	            Arrays.sort(string2Array);  
	           
	           if (Arrays.equals(string1Array,string2Array)) {  
	            System.out.println("words are anagrams");  
	           }
	           else {  
	            System.out.println("words are not anagrams"); 
	           }
	        }
	    }
	       
	        
	   public static void main(String[] args) { 
	        String string1,string2;
	        System.out.println("Enter two Strings");
	        string1=scanner.nextLine();
	        string2=scanner.nextLine(); 
	        isAnagram(string1,string2);
	    }
	    
	    
}
