package com.bridgelabz.algorithm;
import java.util.Scanner;
public class FindNumber {
	static Scanner scanner=new Scanner(System.in);
	public static void guessNumber(int start,int end) {
		if(start==end) {
			System.out.println(start);
			return;
		}
		int middle=(start+end)/2;
		System.out.println("your number between "+start+" and "+middle+" ?");
		System.out.println("Enter 1 for yes and 2 for no");
		int option=scanner.nextInt();
		if(option==1)
			guessNumber(start, middle);
		else
			guessNumber(middle+1,end);
			
		
		
	}
	
	public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        guessNumber(0, number - 1);
        scanner.close();

    }

}
