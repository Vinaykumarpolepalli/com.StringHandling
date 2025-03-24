package com.StringHandling;

public class StringHandling13 {

	public static void main(String[] args) {
		String s5=null;
		String s6="";
		String s7=" ";
		
		//System.out.println(s5.isEmpty());//NE
		System.out.println(s6.isEmpty());//true
		System.out.println(s7.isEmpty());//false
		System.out.println(s6.isBlank());//true
		System.out.println(s7.isBlank());//true
		System.out.println();
		String s1="java";
		String s2= "java";
		String s3=new String ("java");
		String s4= new String ("java");
		
		s3=s3.intern();
		System.out.println(s1==s2);//true
		System.out.println(s3==s4);//false
		System.out.println(s2==s3);//false
		
				
		
		String s = "java is simple in Vcube software solution ";
		System.out.println(s.indexOf('a'));//1
		System.out.println(s.indexOf("in"));//15
		
		System.out.println(s.indexOf('a',4));
		System.out.println(s.indexOf("so",25));
		
		
	}

}
