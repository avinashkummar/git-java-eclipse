package com.lara;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

import java.util.*;

public class count1 {
	public static void test1(String s1)
	{
		//char[] c=s1.toCharArray();
		String[] a =s1.split(",");
		//List<String> ls= (List) Arrays.asList(a);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String c1:a)
		{
			if(map.containsKey(c1.toLowerCase()))
			{
				map.put(c1, map.get(c1.toLowerCase())+1);
			}
			else
			{
				map.put(c1.toLowerCase(), 1);
			}
			
		}
	
		System.out.println(map);
		Set<String> set1=map.keySet();
		//Set<String> hs = new HashSet(ls);
		for(String s2:set1)
		{
			if(map.get(s2)>1)
			{
				System.out.println(s2+":"+ map.get(s2));
			}
		}
		System.out.println("==============================================");
		//for(String s2: hs){
		//	System.out.println(s2+": "+ Collections.frequency(ls, s2));
		//}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1("breed,butter,breed");

	}

}
