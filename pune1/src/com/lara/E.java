package com.lara;

public class E {
	static int i;
	int j;
	void display()
	{
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		//E.i=10;
		E e1=new E();
		//e1.j=20;
		e1.display();
		
		E e2=new E();
		//e2.j=30;
		e2.display();

	}

}
