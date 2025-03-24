package com.StringHandling;

public class StringHandling8Methods {

	public static void main(String[] args) {
    String s = "vinaykumar";
    String s1= "vinay";
    System.out.println(s.compareTo(s1));
    
    String s2="Krishanveni";
    String s3="krishan";
    System.out.println(s2.compareTo(s3));
    
    String s4="Hello";
    String s5="Hello  world";
    System.out.println(s4.compareTo(s5));
    
    String s6="Vinay";
    String s7= "vinay";
    System.out.println(s6.compareTo(s7));
    System.out.println(s6.compareToIgnoreCase(s7));
    
    String s8="vinay";
    String s9="java";
    System.out.println(s8.concat(s9));
    
    String s10 ="Vcube";
    String s11="Software solutions";
    System.out.println(s10+s11);
    
    int i = 100;
    int i1=10;
    System.out.println(i+i1);
    String s12="vinay";
    System.out.println(s12+i);
    		
    

  
	}

}
