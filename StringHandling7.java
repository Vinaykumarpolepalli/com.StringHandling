package com.StringHandling;

public class StringHandling7 {

	public static void main(String[] args) {
		String s = "Abhi";
		System.out.println(s.codePointAt(1)); //97
		System.out.println(s.codePointBefore(1));
		System.out.println(s.codePointCount(0, 2));
		
		String s1= "Adhi";
		System.out.println(s.compareTo(s1));
		 System.out.println("Hello");
		String s2= "java";
		String s3= "Java is simple";
		System.out.println(s2.compareTo(s3));
		
	}

}
