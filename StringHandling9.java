package com.StringHandling;

import java.util.Scanner;

public class StringHandling9 {

	public static void main(String[] args) {
		
		
		String s2= "ALL THE BEST";
		System.out.println(s2.toUpperCase());
		String s3="GOOD LUCK";
		System.out.println(s3.toLowerCase());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s= sc.nextLine();
		
		System.out.println("Enter the String to Search");
		String s1=sc.nextLine();
		
		
//		if(s.contains(s1)) {
//			System.out.println("The given String is Available");
//		}else {
//			System.out.println("The given String is not Available ");
//		}
		

		if(s.toUpperCase().contains(s1)) {
			System.out.println("The given String is Available");
		}else {
			System.out.println("The given String is not Available ");
		}
	}

}
