package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSort{
	static Scanner scanner=new Scanner(System.in);
	

	public static  <T extends Comparable<T>>void insertionSort(T words[]){
	
		for(int index=0;index<words.length;index++)
		{
			T key=words[index];
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
	static <T> void printArray(T array[]) {
		for (T word : array) {
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