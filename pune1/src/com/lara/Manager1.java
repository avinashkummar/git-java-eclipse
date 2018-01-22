package com.lara;
class A1
{
	 void test2()
	{
		System.out.println("Hello World!111");
	}

}
class B extends A1
{
	  void test2()
	{
		System.out.println("Hello World222");
	}
}
class Manager1 
{
	public static void main(String[] args) 
	{
		//A1 a1=new A1();
		//a1.test2();
	    A1 a1=new B();
		a1.test2();
		//A1 a2=new B();
		//a2.test2();
		
		//System.out.println("Hello World!");
	}
}
