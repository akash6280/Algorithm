package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSort{
	static Scanner scanner=new Scanner(System.in);
	

	public static void insertionSort(String words[]){
	
		for(int index=0;index<words.length;index++)
		{
			String key=words[index];
			int indexTo=index-1;
	
			while(indexTo>=0 && words[indexTo].compareTo(key)>0)
			{
				words[indexTo+1]=words[indexTo];
				indexTo--;
			}
	
			words[indexTo+1]=key;
	
		}
	
	
		printArray(words);
	}
	static void printArray(String[] array) {
		for (String word : array) {
			System.out.print(word + " ");
		}

	}

	public static void main(String[] args) 	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter list of words to perform insertion sort:");
		String sentence=scanner.nextLine();
		String[] word = sentence.split(" ");
		insertionSort(word);
		scanner.close();
	
	}
}