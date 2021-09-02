package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSort {
static Scanner scanner=new Scanner(System.in);
	

	public static void bubbleSort(int listOFNumber[]){
	int size=listOFNumber.length;
		for (int i = 0; i < size - 1; i++)
		      for (int j = 0; j < size - i - 1; j++)

		        if (listOFNumber[j] > listOFNumber[j + 1]) {
		          int temp = listOFNumber[j];
		          listOFNumber[j] = listOFNumber[j + 1];
		          listOFNumber[j + 1] = temp;
		        }
	
	
		printArray(listOFNumber);
	}
	static void printArray(int[] listOfNumber) {
		for (int number : listOfNumber) {
			System.out.print(number + " ");
		}

	}

	public static void main(String[] args) 	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scanner.nextInt();

		int listOFNumber[]= new int[size];

		System.out.println("Enter  elements");
		for(int index=0;index<size;index++)
		{
			listOFNumber[index]=scanner.nextInt();

		}
		bubbleSort(listOFNumber);
		scanner.close();
	
	}
}

