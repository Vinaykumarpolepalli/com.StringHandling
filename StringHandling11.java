package com.StringHandling;

import java.util.Scanner;

public class StringHandling11 {
	
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         
         StringHandling11 t1= new StringHandling11();
         System.out.println(t1.hashCode());
         String s3="Vinay";
         System.out.println(s3.hashCode());
         
         System.out.println("Enter username");
         String s = sc.next();
         System.out.println("Enter password");
         sc.nextLine();
         String s1=sc.nextLine();
         
         
         if(s.equalsIgnoreCase("vinay") && s1.equals("Vinay@1234")){
        	 System.out.println("Welcome user");
        	 
         }
      
        	 else {
         
        	 System.out.println("Invalid user credentials");
         }
         
         
         
	}

}
