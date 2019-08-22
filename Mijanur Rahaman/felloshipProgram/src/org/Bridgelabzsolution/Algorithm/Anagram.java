package org.Bridgelabzsolution.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args)
	{
		System.out.println("enter first string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("enter second string:");
		String r=sc.next();
		if(s.length()==r.length()) 
		{
		char arr1[]=s.toCharArray();
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		char arr2[]=r.toCharArray();
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		boolean v=false;
		for(int i=0;i<s.length();i++)
		  {
			if (arr1[i]==arr2[i])
		  v=true;
		else 
			v=false;
		  }
		if(v)
			System.out.println("string is anagram");
		else
			System.out.println("string is not anagram");
		}
	  }
	
	}


