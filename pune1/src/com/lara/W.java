package com.lara;

class W 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			
             System.out.println(1);
             System.out.println(2);
			 return;
		}
		catch (Exception ex)
		{
			 System.out.println("from catch");
		}
		finally
		{
			 System.out.println("from finally");
		}
		System.out.println("main end");
	}
}

