package com.lara;


class X
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
		
		System.out.println("main end");
	}
}

