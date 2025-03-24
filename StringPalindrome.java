package com.StringHandling;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String s = sc.nextLine();
    String rstr ="";
    
    for (int i =0;i<s.length();i++) {
    	char c = s.charAt(i);
    	rstr= c+rstr;
    	
    }
    
    if(s.equalsIgnoreCase(rstr)) {
    	System.out.println("The given is palindrome");
    }else {
    	System.out.println("The givem is not a palindrome");
    }
    System.out.println(rstr);
	}

}

