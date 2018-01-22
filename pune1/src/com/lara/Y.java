package com.lara;

import java.sql.SQLException;

class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			
             System.out.println(1);
			 int i=10/0;
             System.out.println(2);
			 return;
		}
		catch (Exception ex)
		{
			 System.out.println("from catch");
			// return;
		}
		//catch(ArithmeticException ex)
		//{
		//	System.out.println("arhtematic");
		//}
		finally
		{
			System.out.println("from finally");
		}
		
		System.out.println("main end");
	}
}

