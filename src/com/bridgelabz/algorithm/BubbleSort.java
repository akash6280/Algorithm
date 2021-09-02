package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSort {
static Scanner scanner=new Scanner(System.in);
	

	public static <T extends Comparable<T>> void bubbleSort(T listOFNumber[]){
	int size=listOFNumber.length;
		for (int iindex1 = 0; iindex1 < size - 1; iindex1++)
		      for (int index2 = 0; index2 < size - iindex1 - 1; index2++)

		        if (listOFNumber[index2].compareTo(listOFNumber[index2 + 1])>0) {
		          T temporaryBucket = listOFNumber[index2];
		          listOFNumber[index2] = listOFNumber[index2 + 1];
		          listOFNumber[index2 + 1] = temporaryBucket;
		        }
	
	
		printArray(listOFNumber);
	}
	static <T>void printArray(T[] listOfNumber) {
		for (T number : listOfNumber) {
			System.out.print(number + " ");
		}

	}

	public static void main(String[] args) 	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scanner.nextInt();

		Integer listOFNumber[]= new Integer[size];

		System.out.println("Enter  elements");
		for(int index=0;index<size;index++)
		{
			listOFNumber[index]=scanner.nextInt();

		}
		bubbleSort(listOFNumber);
		scanner.close();
	
	}
}

