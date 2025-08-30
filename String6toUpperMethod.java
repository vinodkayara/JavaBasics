package com.stringpractice;

public class String6toUpperMethod {
	
	public static String conv_upper(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>=97&&ch<=122) {
				res=res+((char)(ch-32));
				
			}
			else {
				res=res+(ch);
			}
			}
		return res;
	}

	public static void main(String[] args) {
		String s="PenTagON space";
		String res= conv_upper(s);
		System.out.println(res);
		

	}

}
