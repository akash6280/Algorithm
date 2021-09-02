package com.bridgelabz.algorithm;
import java.util.*;
import java.util.Arrays;
public class BinarySearch {
	static Scanner scanner=new Scanner(System.in);
	
	public static boolean binarySearch(String[] words,String key) {
		
		int length=words.length;
		int low=0;
		int high=length-1,middle=0;
		
		while(low <=high) {
			
			middle=(low+high)/2;
			if(key.compareTo(words[middle])==0) {
				return true;
			}
			else if(key.compareTo(words[middle])<0) {
				high=middle-1;
			}
			else {
				low=middle+1;
			}

		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter sentence ");
		String sentence=scanner.nextLine();
		System.out.println("Enter key to be searched ");
		String key=scanner.nextLine();
		
		String[] words=sentence.toLowerCase().split(" ");
		Arrays.sort(words); 
		
		if(binarySearch(words,key)) {
			System.out.println("key found");
		}
		else {
			System.out.println("key not found");
		}
		
		
	}

}
