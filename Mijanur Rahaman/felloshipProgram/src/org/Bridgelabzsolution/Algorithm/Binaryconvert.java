package org.Bridgelabzsolution.Algorithm;

import java.util.Scanner;

public class Binaryconvert {

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		String bin=Integer.toBinaryString(n);
		int len=bin.length();
		/*
		 * int a; String x=""; while(n>0) { a=n%2; x=x+""+a; n=n/2; }
		 */
		int zero=8-len;
		String s="";
		while(zero>0)
		{
			
			s=s+0;
			zero--;
			
		}
		s=s+bin;
		System.out.println("value in binary:"+bin);
		
		System.out.println("value in binary:"+s);
		char arr[]=s.toCharArray();
   
	for(int i=0,j=s.length()/2;i<s.length()/2-1;i++,j++)
	{
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	System.out.println("after swaping:"+String.valueOf(arr));
	 int number=Integer.parseInt(String.valueOf(arr));
	 double value=0.0,i=0.0;
	 while(number>0)
	 {
		 int digit=number%10;
		 value=value+digit*Math.pow(2.0, i);
		 i++;
		 number=number/10;
	 }
	 System.out.println("after swaping value is"+String.valueOf(arr)+"---->"+value);
	}
	
}
