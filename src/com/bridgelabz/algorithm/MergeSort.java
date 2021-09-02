package com.bridgelabz.algorithm;
import java.util.Scanner;
public class MergeSort {
	static Scanner scanner=new Scanner(System.in);
	
	public static void merge(String words[], int startIndex, int middleIndex, int endIndex){
		
		String[] temporaryArray = new String[endIndex - startIndex + 1];
		int indexSubArray1 = startIndex, indexSubArray2 = middleIndex+1, k = 0;

		while(indexSubArray1 <= middleIndex && indexSubArray2 <= endIndex) {
			if(words[indexSubArray1].compareTo(words[indexSubArray2])<=0) {
				temporaryArray[k] = words[indexSubArray1];
				k++;
				indexSubArray1++;
			}
			else {
				temporaryArray[k] = words[indexSubArray2];
				k++;
				indexSubArray2++;
			}
		}

		while(indexSubArray1 <= middleIndex) {
			temporaryArray[k] = words[indexSubArray1];
			k += 1; indexSubArray1 += 1;
		}

		while(indexSubArray2 <= endIndex) {
			temporaryArray[k] = words[indexSubArray2];
			k += 1; indexSubArray2 += 1;
		}

		for(indexSubArray1 = startIndex; indexSubArray1 <= endIndex; indexSubArray1 += 1) {
			words[indexSubArray1] = temporaryArray[indexSubArray1 - startIndex];
		}
    }
	
	public static void mergeSort(String listOfWords[],int startIndex,int endIndex){

		if(startIndex<endIndex){
			int middleIndex=startIndex+(endIndex-startIndex)/2;
			mergeSort(listOfWords, startIndex, middleIndex);
			mergeSort(listOfWords, middleIndex+1, endIndex);

			merge(listOfWords,startIndex,middleIndex,endIndex);
		}
	}

		
	
	public static void printArray(String words[]){
	        for (int index = 0; index < words.length; index++) {
	            System.out.print(words[index] + " ");
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence");

		String sentence=scanner.nextLine();
		String listOfWords[] = sentence.toLowerCase().split(" ");
		mergeSort(listOfWords,0,listOfWords.length-1);
		
		printArray(listOfWords);
		scanner.close();

	}
}
