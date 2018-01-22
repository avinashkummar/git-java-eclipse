package com.lara;

import java.util.Collection;

public class Test {

	 public final static void main(String[] args) {
		//System.out.println("ram");
		int[] x={1,20,3,60,20,10,15,23};
		int max=x[0];
		System.out.println(x.length);
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		System.out.println(max);
		System.out.println(x.length);

	}


}
