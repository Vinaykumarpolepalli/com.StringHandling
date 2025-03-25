package com.StringHandling;

public class StringHandling20 {

	int id = 123;
	String names= "vinay";
	
	@Override
	public String toString() {
		return "ID:"+id +" "+ "Name:"+names;
	}
	public static void main(String[] args) {
		
		StringHandling20 st = new StringHandling20();
		System.out.println(st);
		
		String str = "String Handling is simple";
		char[] chArr= str.toCharArray();
		
		for (char c : chArr) {
			System.out.print(c+" ");	
			}
	}

}
