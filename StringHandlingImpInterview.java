package com.StringHandling;

import java.util.Scanner;

//write a program to find max character from given String
//input is : aaabbcccc
		//output:c 
public class StringHandlingImpInterview {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String :");
		String str =sc.nextLine();
		
		int[] arr = new int[127];
		for(int i =0;i<str.length();i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		
		int max = -1;
		char c = ' ';
		for(int i =0;i<str.length();i++) {
			if(max <arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				c= str.charAt(i);
				
			}
		}
		System.out.println("Max character is :"+c);
		
	}

}
