package com.StringHandling;

import java.util.Scanner;

public class StringHandlingReplace15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=  sc.nextLine();
		System.out.println("The given String:"+s);
		System.out.println("Enter a character which you want to update ");
		String  s1= sc.next();
		System.out.println("Enter a character  update");
		String  s2 = sc.next();
		s=s.replace(s1, s2);
		//s =s.replace('a','A' );
		System.out.println("The update String:"+s);
	}

}


