package com.lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class D {

	public static void main(String[] args) throws Exception {
		/*File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
       fr.close();*/
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line !=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}
