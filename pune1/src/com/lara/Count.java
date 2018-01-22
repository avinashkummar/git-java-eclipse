package com.lara;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter any things");
		String s1=scn.nextLine();
		//String s1="avinash kumaar";
		//String s3=s1.replace("a", "");
		System.out.println(s1.length());
		//System.out.println(s3);
		char c;
		String s2=" ";
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			if(s2.indexOf(c)==-1)
			{
				s2=s2+c;
			System.out.println(c+"-" + test(s1,c));
			}
		}
	}
		
		public static int test(String org0, char org1)
		{
			
			
			
			return org0.length() - org0.replace(org1+"","").length();
		}


}
