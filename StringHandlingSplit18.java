package com.StringHandling;

import java.util.Scanner;

public class StringHandlingSplit18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s= sc.nextLine();
		
		String [] arrstr = s.split("@",3);
	for(String str:arrstr) {
		System.out.println(str);
		
	}
	}

}
