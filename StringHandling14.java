package com.StringHandling;

import java.util.Scanner;

public class StringHandling14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=  sc.nextLine();
		System.out.println("The given String:"+s);
		System.out.println("Enter a character which you want to update ");
		char c= sc.next().charAt(0);
		System.out.println("Enter a character  update");
		char c1 = sc.next().charAt(0);
		s=s.replace(c, c1);
		//s =s.replace('a','A' );
		System.out.println("The update String:"+s);
		
		
		}

}
