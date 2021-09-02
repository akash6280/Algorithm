package com.bridgelabz.algorithm;
import java.util.Scanner;
public class MergeSort {
	static Scanner scanner=new Scanner(System.in);
	
	public static <T extends Comparable<T>> void merge(T listOfWords[], int startIndex, int middleIndex, int endIndex){
		
		T[] temporaryArray = (T[]) new String[endIndex - startIndex + 1];
		Integer indexSubArray1 = startIndex, indexSubArray2 = middleIndex+1, k = 0;

		while(indexSubArray1 <= middleIndex && indexSubArray2 <= endIndex) {
			if(listOfWords[indexSubArray1].compareTo(listOfWords[indexSubArray2])<=0) {
				temporaryArray[k] = listOfWords[indexSubArray1];
				k++;
				indexSubArray1++;
			}
			else {
				temporaryArray[k] = listOfWords[indexSubArray2];
				k++;
				indexSubArray2++;
			}
		}

		while(indexSubArray1 <= middleIndex) {
			temporaryArray[k] = listOfWords[indexSubArray1];
			k += 1; indexSubArray1 += 1;
		}

		while(indexSubArray2 <= endIndex) {
			temporaryArray[k] = listOfWords[indexSubArray2];
			k += 1; indexSubArray2 += 1;
		}

		for(indexSubArray1 = startIndex; indexSubArray1 <= endIndex; indexSubArray1 += 1) {
			listOfWords[indexSubArray1] = temporaryArray[indexSubArray1 - startIndex];
		}
    }
	
	public static <T extends Comparable<T>> void mergeSort(T listOfWords[],int startIndex,int endIndex){

		if(startIndex<endIndex){
			int middleIndex=startIndex+(endIndex-startIndex)/2;
			mergeSort(listOfWords, startIndex, middleIndex);
			mergeSort(listOfWords, middleIndex+1, endIndex);

			merge(listOfWords,startIndex,middleIndex,endIndex);
		}
	}

		
	
	public static <T>  void printArray(T words[]){
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
