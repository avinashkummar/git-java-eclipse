package com.lara;

public class RemoveDuplicateElement {


	public static void main(String[] args) {
		int[] x={10,11,23,25,22,30,10,11,25,24};
		for(int i=0;i<x.length;i++)
		{
			System.out.print( x[i] +",");
		}
		System.out.println();
		int end=x.length;
		for(int i=0;i<end;i++)
		{
			for(int j=i+1;i<end;j++)
			{
				if(x[i]==x[j])
				{
					int shiftLeft=j;
					for(int k=j+1;k<end;k++,shiftLeft++)
					{
						x[shiftLeft]=x[k];
					}
					end--;
					j--;
				}
			}
		}
		//System.out.println("avinash");
		
	}

}
