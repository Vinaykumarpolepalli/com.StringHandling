package com.StringHandling;

public class StringHandling10 {

	public static void main(String[] args) {
      char [] c = {'A','P','P','L','I','C','A','T','I','O','N'};
      System.out.println(c);
      
    String s=   String.copyValueOf(c);
    System.out.println(s);
    
    String [] names= {"Vinay","Guru","naveen","Pavan","Vijay","ranjith","rakesh"};
    for (String name: names) {
    	if(name.toLowerCase().endsWith("y") || name.toLowerCase().startsWith("ra")) {
    		System.out.println(name);
    		
    	}
    	
    }
      
	}

}
