package com.StringHandling;

class Employee{
	
	@Override
	 public String toString () {
		 return "";
	 }
	
}

public class StringHandling4 {

	public static void main(String[] args) {
		
		String s3 = new String ("Vinay kumar");// 2 Object 
		String s4= new String ("Vinay Kumar");// 1 Object 
		String s5 = "Vinay Kumar";// 0 Object 
		 
		String s6= "Vinay";
		String s8 = "vinay";
		String s7= "Vinay";
			
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6==s7);

		
    StringHandling4 s1 = new StringHandling4();
    System.out.println(s1);
    
    
    Thread t= new Thread();
    System.out.println(t);
    
    Employee e = new Employee();
    System.out.println(e);
    
    String s2 = new String();
    System.out.println(s2);
    
    System.out.println("Vinay");
    
    
    
    
    
	}

}
