package com.lara;

public class LinearSearch {
	public static void main(String[] args)
	{
		int[] arr = {1,10,3,6,5};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
		int index=linearSearch(arr,3);
		if(index==-1)
		{
			System.out.println("element is not found");
		}
		else
		{
			System.out.println("element is found:"+index);
		}
		//int search =3;
		//System.out.println("is found index:" + linearSearch( arr,300));
	}
	
	public static int linearSearch(int[] arr,int search)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == search)
			{
				return i;
			}
		}
		return -1;
	}

}
