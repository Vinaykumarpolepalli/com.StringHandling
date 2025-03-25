package com.StringHandling;

public class StringHandling19Substring {

	public static void main(String[] args) {
		//SubString
				//Parameters:beginIndex the beginning index, 
				//inclusive.endIndex the ending index, exclusive
				String s1="J2SE J2EE";
				System.out.println(s1.substring(0, 6));
				
				CharSequence c =s1.subSequence(0, 6);
			    System.out.println(c);
				
	}

}
