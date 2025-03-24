package com.StringHandling;

public class StringHandling1 {

	public static void main(String[] args) {
		//String literals
     String str= "Polepalli vinay Kumar";
     
     //String with new Object
     String s1 = new String();
     String s2= new String("Vcube ");
     //String with  re-assigement operator
     String s3 = str;
     //it print Empty space in this re-assigement 
     //String with concatenation operator
     String s4 = "vinay"+"kumar";
     
    	System.out.println(str);
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(s3);
    	System.out.println(s4);
    	
	}

}
