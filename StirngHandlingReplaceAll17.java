package com.StringHandling;

public class StirngHandlingReplaceAll17 {

	public static void main(String[] args) {
		String s = "     Vinay       Polepalli       ";
		System.out.println("The given String :" + s);
		System.out.println("The update String :" + s.trim());
		
		s= s.replaceAll("\\s","");
		System.out.println("The update all String :" + s.trim());
		
		
		String s1="abcbc1234567vinay37373";
		//s1=s1.replaceAll("\\d","");
		//s1=s1.replaceAll("\\d","*");
		//s1=s1.replace("\\d","*");
		s1=s1.replaceFirst("\\d","*");
		System.out.println("The update all String :" + s1.trim());
		System.out.println("The update all String :" + s1.trim());
	}

}
